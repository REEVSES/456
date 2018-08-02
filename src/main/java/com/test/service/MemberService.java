package com.test.service;
import com.test.model.User;
import com.test.utils.loginLevel.ToLayuiJson;

import java.util.List;

public interface MemberService {
    User getUserByName(String username);
    int resetPwd(String newpwd,String username);
    ToLayuiJson toLayuiJson(String leve);
    List<String> selectContain(String leve, String depet,String team);
}
