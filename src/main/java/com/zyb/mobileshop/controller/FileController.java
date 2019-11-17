package com.zyb.mobileshop.controller;

import ch.qos.logback.core.util.FileUtil;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.util.MSUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileController {
    //上传图片
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {
        Result result = new Result();
        String url = "http://" + request.getServerName() + ":" + request.getLocalPort();
        //重命名图片
        String picTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String picType = file.getContentType();
        String fileName = MSUtil.md5(picTime);
        if ("image/jpeg".equals(picType)) {
            fileName = fileName.concat(".jpg");
        } else if ("image/png".equals(picType)) {
            fileName = fileName.concat(".png");
        } else if ("image/gif".equals(picType)) {
            fileName = fileName.concat(".gif");
        } else {
            fileName = fileName.concat(".jpg");
        }
        //存放图片的地址
        String savePath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/uploadImg/";
//        String savePath =  request.getServletContext().getRealPath("/upload");
        File saveFile = new File(savePath);
        if (!saveFile.exists() && !saveFile.isDirectory()) {
            System.out.println(savePath + "目录不存在，需要创建");
            saveFile.mkdirs();
        }
        try {
            uploadFile(file.getBytes(), savePath, fileName);
//            //复制文件
//            file.transferTo(targetFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            System.out.println("文件上传失败" + e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件上传失败" + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String filePath = savePath + File.separator + fileName;
        System.out.println(filePath);
        result.setStatus(0);
        result.setMsg("文件上传成功");
        result.setData(filePath);
        return result;
    }

    void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
