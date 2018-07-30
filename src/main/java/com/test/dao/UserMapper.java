package com.test.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByName(String username);
    int resetPwd(@Param("newpwd")String newpwd,@Param("username") String username);
}
