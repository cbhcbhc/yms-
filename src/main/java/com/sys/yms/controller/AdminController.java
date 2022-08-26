package com.sys.yms.controller;

import com.sys.yms.entity.Admin;
import com.sys.yms.service.impl.AdminServiceImpl;
import com.sys.yms.util.ResponseCode;
import com.sys.yms.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    AdminServiceImpl adminServiceImpl;

    @PostMapping("/login")
    @ResponseBody
    public ResponseData login(String account, String pwd, HttpSession session){
        //调用service
        Admin admin= adminServiceImpl.getAdminByAccAndPwd(account,pwd);
        //判断admin是否为空
        if(admin !=null){
            //账号密码正确
            //向域对象当中存入数据
            session.setAttribute("adminInfo",admin);
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
        //若不正确
        return new ResponseData(ResponseCode.ERROR_1);}
    }
}
