package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsTagMapper;
import com.zyb.mobileshop.entity.MsTag;
import com.zyb.mobileshop.entity.brief.BriefTag;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagService;
import com.zyb.mobileshop.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MsTagService_imp implements MsTagService {

    @Resource
    private MsTagMapper msTagMapper;
    @Autowired
    private Page page;

    @Transactional
    @Override
    public Result addTag(String name, int type, int count, int team) {
        //新增标签
        Result result = new Result();
        MsTag checkTag = msTagMapper.findByName(name);
        if (checkTag != null) {
            result.setStatus(-1);
            result.setMsg("已经存在此标签");
            return result;
        }
        MsTag tag = new MsTag();
        tag.setName(name);
        tag.setType((byte) type);
        tag.setCount(count);
        tag.setSort((short) 0);//默认没有排序
        //0：推荐区，1:1楼广告区，2:2 楼广告区.......
        tag.setTeam((byte) team);
        tag.setCreatime(null);
        tag.setModifytime(null);
        msTagMapper.insert(tag);
        result.setStatus(0);
        result.setMsg("新增标签成功");
        result.setData(tag);
        return result;
    }

    @Override
    public Result loadAllTagsByPage(int current) {
        //加载所有标签（分页）
        Result result = new Result();
        page.setCurrent(current);
        List<MsTag> tags = msTagMapper.findAllByPage(page);
        if (tags.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此页没有标签");
            return result;
        }
        result.setStatus(0);
        result.setMsg("查询标签成功");
        result.setData(tags);
        return result;
    }

    @Override
    public Result loadAllGoodsByTeam(int team) {
        //根据分组加载标签下的商品
        Result result = new Result();
        Map<String, Object> map = new HashMap<>();
        map.put("type", 0);
        map.put("team", team);
        List<MsTag> tags = msTagMapper.findByTypeAndTeam(map);
        if (tags.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此分组下没有商品标签");
            return result;
        }
        List<BriefTag> allBTS = new ArrayList<>();
        for (MsTag tag : tags) {
            //标签商品引用表，商品表，标签表 三表关联查询
            List<BriefTag> bts = msTagMapper.findUnionByGoodsTagId(tag.getTagId());
            allBTS.addAll(bts);
        }
        if (allBTS.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此组标签下没有商品");
            result.setData(allBTS);
            return result;
        }
        result.setStatus(0);
        result.setMsg("加载标签下的商品成功");
        result.setData(allBTS);
        return result;
    }

}
