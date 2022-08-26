package com.sys.yms;

import com.sys.yms.entity.Admin;
import com.sys.yms.entity.Product;
import com.sys.yms.entity.Type;
import com.sys.yms.mapper.AdminMapper;
import com.sys.yms.mapper.ProductMapper;
import com.sys.yms.mapper.TypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class YmsApplicationTests {
    @Resource
    AdminMapper adminMapper;

    @Test
    void contextLoads() {
        Admin adminByAccAndPwd = adminMapper.findAdminByAccAndPwd("admin", "admin123");
        System.out.println(adminByAccAndPwd);
    }

    @Resource
    TypeMapper typeMapper;
    @Test
    void test() {
        List<Type> allType = typeMapper.findAllType();
        for(Type type:allType){
            System.out.println(type);
        }
    }

    @Resource
    ProductMapper mapper;
    @Test
    void test1(){

    }

}
