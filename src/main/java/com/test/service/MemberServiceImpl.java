package com.test.service;
import com.test.dao.User;
import com.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MemberService")
public class MemberServiceImpl implements MemberService{

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.selectByName(username);
    }

    @Override
    public boolean resetPwd(String newpwd,String username) {
        return userMapper.resetPwd(newpwd,username);
    }
}
