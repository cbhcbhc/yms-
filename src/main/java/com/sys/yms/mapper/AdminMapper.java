package com.sys.yms.mapper;

import com.sys.yms.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//@Mapper,在启动器写了 @MapperScan(basePackages = "com.sys.yms.mapper")

public interface AdminMapper {
//    List<Admin> getAdmin();

        /**
         * 根据账号、密码查询admin的数据
         * @param account
         * @param pwd
         * @return
         */
        Admin findAdminByAccAndPwd(@Param("acc") String account,
                                   @Param("pwd") String pwd);
}
