package com.ringo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadd {
    @RequestMapping("uploadfile")
    public String upload(HttpServletRequest request) {
        MultipartHttpServletRequest mhr= (MultipartHttpServletRequest) request;
        MultipartFile mf=mhr.getFile("file");
        //文件的拷贝
        if(null!=mf&mf.getSize()>0) {
            //获取项目所在路径
            String basePath=request.getSession().getServletContext().getRealPath("/");
            File upload=new File(basePath+"/upload");
            if(!(upload.exists())){
                upload.mkdir();
            }
            //设置文件名，以系统时间命令时间的毫秒数命名上传文件+文件原始文件名后缀
            String file_name=System.currentTimeMillis()+mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf("."));
            try {
                //文件的拷贝
                mf.transferTo(new File(upload,file_name));
                request.setAttribute("msg","文件上传成功");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            request.setAttribute("msg","文件上传失败");
        }
        return "result";
    }
}
