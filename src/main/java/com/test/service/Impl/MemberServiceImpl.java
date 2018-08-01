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
     * @param leve
     * @return
     */
    @Override
    public ToLayuiJson toLayuiJson(String leve){
        int level = Integer.valueOf(leve);
       // int myID = Integer.getInteger(id);
        //int mywhzid = Integer.getInteger(whzid);
        ToLayuiJson toLayuiJson = new ToLayuiJson();
        List<ToLayuiJson_l1> toLayuiJson_l1 = new ArrayList<>();
        List<ToLayuiJson_l2> toLayuiJson_l2_1 = new ArrayList<>();
        List<ToLayuiJson_l2> toLayuiJson_l2_2 = new ArrayList<>();
        List<ToLayuiJson_l2> toLayuiJson_l2_3 = new ArrayList<>();

        //管理员权限
        if(level>5){
            toLayuiJson_l1=userMapper.selectMotherset(level);//判断小于
            toLayuiJson_l2_1=userMapper.selectSubset(1);
            toLayuiJson_l2_2=userMapper.selectSubset(2);
            toLayuiJson_l2_3=userMapper.selectSubset(3);
            toLayuiJson_l1.get(0).setSubset(toLayuiJson_l2_1);
            toLayuiJson_l1.get(1).setSubset(toLayuiJson_l2_2);
            toLayuiJson_l1.get(2).setSubset(toLayuiJson_l2_3);
        }
        //用户权限
        else {
            toLayuiJson_l1=userMapper.selectMotherset(level);
            toLayuiJson_l2_2=userMapper.selectSubset(2);
            toLayuiJson_l2_3=userMapper.selectSubset(3);
            toLayuiJson_l1.get(0).setSubset(toLayuiJson_l2_2);
            toLayuiJson_l1.get(1).setSubset(toLayuiJson_l2_3);
        }
        toLayuiJson.setData(toLayuiJson_l1);
        System.out.println(toLayuiJson.toString());
        return toLayuiJson;
    }

    @Override
    public List<String> selectContain(String leve, String depet,String team) {
        int level = Integer.valueOf(leve);
        return userMapper.selectContains(level,depet,team);
    }
}
