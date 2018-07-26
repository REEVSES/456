package com.test.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByName(String username);
    boolean resetPwd(@Param("userpwd") String newpwd,@Param("username") String username);
}
