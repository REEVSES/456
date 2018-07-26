package com.test.service;
import com.test.dao.User;
public interface MemberService {
    User getUserByName(String username);
    boolean resetPwd(String newpwd,String username);
}
