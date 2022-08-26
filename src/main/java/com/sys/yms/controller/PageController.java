package com.sys.yms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    /**
     * 响应登录页面
     * @return
     */
    @GetMapping("/loginPage")
    public String showLoginPage(){
        return "login";
    }

    /**
     * 响应系统主页面
     * @return
     */
    @GetMapping("/mainPage")
    public String showMainPage(){
        return "mainPage";
    }

/*    *//**
     * 用户名密码验证
     * @param account
     * @param pwd
     * @param session
     * @return
     */
/*
      @Resource
    AdminService adminService;
    @PostMapping("/login")
    public String loginJudge(@RequestParam("account") String account,
                             @RequestParam("pwd") String pwd,
                             HttpSession session){
        List<Admin> admins = adminService.getAdmins();
        for(Admin admin:admins){
            String account1 = admin.getAccount();
            String password1 = admin.getPassword();
            if(account.equals(account1) && pwd.equals(password1)){
                //若账号密码正确，则数据存入session，并跳转到主页
                session.setAttribute("account",account);
                //跳方法（url）
                return "redirect:/mainPage";
            }
        }
        //若错误，则重定向到登录页面
        session.setAttribute("msg","密码输入有误！");
        return "redirect:/loginPage";
    }*/


    /**
     * 响应系统主页面的欢迎页welcome.html
     * @return
     */
    @GetMapping("/welcomePage")
    public String showWelcomePage(){
        return "welcome";
    }

    /**
     * 响应商品类型管理页面
     * @return
     */
    @GetMapping("/typeListPage")
    public String showTypeListPage(){
        return "typeList";
    }

}
