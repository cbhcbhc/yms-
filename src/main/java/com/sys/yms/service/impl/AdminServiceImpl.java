package com.sys.yms.service.impl;

import com.sys.yms.entity.Admin;
import com.sys.yms.mapper.AdminMapper;
import com.sys.yms.service.AdminService_1;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AdminServiceImpl implements AdminService_1 {

    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin getAdminByAccAndPwd(String account, String pwd){
        return adminMapper.findAdminByAccAndPwd(account,pwd);
    }
}
