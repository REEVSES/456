package com.test.service;
import com.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.dao.companyMemberDao;

@Service("MemberService")
public class MemberServiceImpl implements MemberService{

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }


    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public companyMemberDao getUserById(int id) {
        return userMapper.selectByID(id);
    }
}
