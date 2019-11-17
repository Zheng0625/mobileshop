package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsImgMapper;
import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsGoodsImg;
import com.zyb.mobileshop.entity.MsGoodsWithBLOBs;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsImgService;
import com.zyb.mobileshop.util.MSUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Service
public class MsGoodsImgService_imp implements MsGoodsImgService {

    @Resource
    private MsGoodsImgMapper msGoodsImgMapper;
    @Resource
    private MsGoodsMapper msGoodsMapper;

    @Override
    //新增商品图片引用
    public Result addImg(int goodsId, int isdefault, String img, String url) {
        Result result = new Result();
        MsGoods msGoods = msGoodsMapper.selectByPrimaryKey(goodsId);
        if (msGoods == null) {
            result.setStatus(-1);
            result.setMsg("此商品不存在");
            return result;
        }
        if (isdefault == 0) {
            Map<String, Object> map = new HashMap<>();
            map.put("goods_id", goodsId);
            map.put("isdefault", 0);
            MsGoodsImg checkGI = msGoodsImgMapper.findByGoodsIdAndIsdefault(map);
            if (checkGI != null) {
                result.setStatus(-1);
                result.setMsg("该商品已有主图");
                return result;
            }
        }
        MsGoodsImg msGoodsImg = new MsGoodsImg();
        msGoodsImg.setGoodsId(goodsId);
        if ("".equals(img)) {
            msGoodsImg.setThumbnail(img);
            msGoodsImg.setBig(img);
            msGoodsImg.setSmall(img);
            msGoodsImg.setOriginal(img);
        } else {
            //调用生成图片的方法，生成四种尺寸图片
            Map map = MSUtil.createImg(img, url);
            String thum = (String) map.get("thum");
            String big = (String) map.get("big");
            String small = (String) map.get("small");
            String orig = (String) map.get("orig");
            msGoodsImg.setThumbnail(thum);//缩略图
            msGoodsImg.setBig(big);//大图
            msGoodsImg.setSmall(small);//小图
            msGoodsImg.setOriginal(orig);//原图
        }
        msGoodsImg.setIsdefault((short) isdefault);
        msGoodsImg.setCreatime(null);
        msGoodsImg.setModifytime(null);
        msGoodsImgMapper.insert(msGoodsImg);
        //如果isdefault=0，将主图信息更新到商品表中
        if (isdefault == 0) {
            MsGoodsWithBLOBs updateGoods = new MsGoodsWithBLOBs();
            updateGoods.setGoodsId(goodsId);
            updateGoods.setThumbnail(msGoodsImg.getThumbnail());
            updateGoods.setBig(msGoodsImg.getBig());
            updateGoods.setSmall(msGoodsImg.getSmall());
            updateGoods.setOrinal(msGoodsImg.getOriginal());
            msGoodsMapper.updateByPrimaryKeySelective(updateGoods);
        }
        //将原图删除
        MSUtil.deleteFile(img);
        result.setStatus(0);
        result.setMsg("新增商品图片成功");
        result.setData(msGoodsImg);
        return result;
    }

    @Override
    //根据id更新
    public Result updateImg(int imgId, String img, String url) {
        Result result = new Result();
        MsGoodsImg checkGI = msGoodsImgMapper.selectByPrimaryKey(imgId);
        if (checkGI == null) {
            result.setStatus(1);
            result.setMsg("不存在此图片引用");
            return result;
        }
        /*
         * 将服务器上的原图删除
         */
        String path = MSUtil.getPath();
        //将资源路径替换成绝对路径
        String oldThum = checkGI.getThumbnail().replace(url, path);
        System.out.println("oldThum:" + oldThum);
        String oldBig = checkGI.getBig().replace(url, path);
        String oldSmall = checkGI.getSmall().replace(url, path);
        String oldOrig = checkGI.getOriginal().replace(url, path);
        //获取图片所在的文件夹
        File f = new File(oldThum);
        File fParent = new File(f.getParent());
        //删除图片
        MSUtil.deleteFile(oldThum);
        MSUtil.deleteFile(oldBig);
        MSUtil.deleteFile(oldSmall);
        MSUtil.deleteFile(oldOrig);
        //删除文件夹
        if (fParent.exists()) {
            //文件夹为空才能删除
            fParent.delete();
        }
        /*
         * 更新图片
         */
        MsGoodsImg goodsImg = new MsGoodsImg();
        goodsImg.setImgId(imgId);
        //图片信息
        if ("".equals(img)) {
            goodsImg.setThumbnail(img);//缩略图
            goodsImg.setBig(img);//大图
            goodsImg.setSmall(img);//小图
            goodsImg.setOriginal(img);//原图
        } else {
            //调用生成图片的方法，生成四种尺寸图片
            Map map = MSUtil.createImg(img, url);
            String thum = (String) map.get("thum");
            String big = (String) map.get("big");
            String small = (String) map.get("small");
            String orig = (String) map.get("orig");
            goodsImg.setThumbnail(thum);//缩略图
            goodsImg.setBig(big);//大图
            goodsImg.setSmall(small);//小图
            goodsImg.setOriginal(orig);//原图
        }
        //如果是主图，更新商品表
        if (checkGI.getIsdefault() == 0) {
            MsGoodsWithBLOBs updateGoods = new MsGoodsWithBLOBs();
            updateGoods.setGoodsId(checkGI.getGoodsId());
            updateGoods.setThumbnail(goodsImg.getThumbnail());
            updateGoods.setBig(goodsImg.getBig());
            updateGoods.setSmall(goodsImg.getSmall());
            updateGoods.setOrinal(goodsImg.getOriginal());
            msGoodsMapper.updateByPrimaryKeySelective(updateGoods);
        }
        Timestamp now = new Timestamp(System.currentTimeMillis());
        goodsImg.setModifytime(now);
        msGoodsImgMapper.updateByPrimaryKeySelective(goodsImg);
        //将上传的原图删除
        MSUtil.deleteFile(img);
        result.setStatus(0);
        result.setMsg("更新商品图片成功");
        return result;
    }

    @Override
    //根据id删除
    public Result deleteImgById(int imgId, String url) {
        System.out.println("url:" + url);
        Result result = new Result();
        MsGoodsImg checkGI = msGoodsImgMapper.selectByPrimaryKey(imgId);
        if (checkGI == null) {
            result.setStatus(1);
            result.setMsg("不存在此图片引用");
            return result;
        }
        /*
         * 将服务器上的原图删除
         */
        String path = MSUtil.getPath();
        //将资源路径替换成绝对路径
        String thum = checkGI.getThumbnail().replace(url, path);
        String big = checkGI.getBig().replace(url, path);
        String small = checkGI.getSmall().replace(url, path);
        String orig = checkGI.getOriginal().replace(url, path);
        //获取图片所在的文件夹
        File f = new File(thum);
        File fParent = new File(f.getParent());
        //删除图片
        MSUtil.deleteFile(thum);
        MSUtil.deleteFile(big);
        MSUtil.deleteFile(small);
        MSUtil.deleteFile(orig);
        //删除文件夹
        if (fParent.exists()) {
            //文件夹为空才能删除
            fParent.delete();
        }
        //如果是主图，更新商品表
        if (checkGI.getIsdefault() == 0) {
            int goodsId = checkGI.getGoodsId();
            MsGoodsWithBLOBs goods = new MsGoodsWithBLOBs();
            goods.setGoodsId(goodsId);
            goods.setThumbnail("");
            goods.setBig("");
            goods.setSmall("");
            goods.setOrinal("");
            msGoodsMapper.updateByPrimaryKeySelective(goods);
        }
        msGoodsImgMapper.deleteByPrimaryKey(imgId);
        result.setStatus(0);
        result.setMsg("删除商品图片引用成功");
        return result;
    }
}
