package com.sys.yms.service;

import com.sys.yms.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService_1 {
    Admin getAdminByAccAndPwd(String account,String pwd);
}
