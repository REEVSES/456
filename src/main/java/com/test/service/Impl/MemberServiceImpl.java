package com.test.service.Impl;
import com.test.dao.User;
import com.test.dao.mapper.UserMapper;
import com.test.service.MemberService;
import com.test.utils.loginLevel.ToLayuiJson;
import com.test.utils.loginLevel.ToLayuiJson_l1;
import com.test.utils.loginLevel.ToLayuiJson_l2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

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
    public int resetPwd(String newpwd,String username) {
        return userMapper.resetPwd(newpwd,username);
    }

    /**
     * 装载权限
     * @param id
     * @param leve
     * @param whzid
     * @return
     */
    @Override
    public ToLayuiJson toLayuiJson(String id, String leve, String whzid) {
        int level = Integer.getInteger(leve);
        int myID = Integer.getInteger(id);
        int mywhzid = Integer.getInteger(whzid);
        ToLayuiJson toLayuiJson = new ToLayuiJson();
        ToLayuiJson_l1 toLayuiJson_l1 = new ToLayuiJson_l1();
        ToLayuiJson_l2 toLayuiJson_l2 = new ToLayuiJson_l2();
        List<ToLayuiJson_l1> list1 = new ArrayList<>();
        List<ToLayuiJson_l2> list2 = new ArrayList<>();
        if(level>=5){

        }
        return null;
    }
}
