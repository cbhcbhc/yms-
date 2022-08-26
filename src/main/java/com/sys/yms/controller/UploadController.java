package com.sys.yms.controller;

import com.sys.yms.entity.MyFile;
import com.sys.yms.util.ResponseCode;
import com.sys.yms.util.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.util.UUID;

@Controller
public class UploadController {
    @PostMapping("/upload")
    @ResponseBody
    public ResponseData uploadFile(@RequestParam("file") MultipartFile multi) {
        //默认上传失败
        ResponseData rd=new ResponseData(ResponseCode.ERROR_5);
        try {
            //一、存储目录的路径
            //相对路径
            String relativeDirPath = "/static/images/productImg";
            //classes目录的路径
            String classesPath = ResourceUtils.getURL("classpath:").getPath();
            //获取存储目录的绝对路径
            File dir = new File(classesPath+relativeDirPath);
            if (!dir.exists()) {
                dir.mkdirs();//不存在则创建
            }
            //二、文件存储的路径
            //获取文件名
            String fileName=multi.getOriginalFilename();
            File file=new File(dir,fileName);
            //三、存储
            multi.transferTo(file);
            //四、将文件存入数据库
            if (file.exists()){
                //将文件的路径存入
                String filePathToStatic="/images/productImg/"+multi.getOriginalFilename();
                //存入数据库
                MyFile myFile=new MyFile();
                myFile.setFileurl(filePathToStatic);
                rd = new ResponseData(ResponseCode.SUCCESS,myFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rd;
    }
}