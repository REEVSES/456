package com.test.service;
import com.test.dao.User;
import com.test.utils.loginLevel.ToLayuiJson;
import com.test.utils.loginLevel.ToLayuiJson_l1;

import java.util.List;

public interface MemberService {
    User getUserByName(String username);
    int resetPwd(String newpwd,String username);
    ToLayuiJson toLayuiJson(List<ToLayuiJson_l1> data,String username);
}
