package com.test.dao.mapper;

import com.test.dao.User;
import com.test.utils.loginLevel.ToLayuiJson_l1;
import com.test.utils.loginLevel.ToLayuiJson_l2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectByName(String username);
    int resetPwd(@Param("newpwd")String newpwd,@Param("username") String username);
    List<ToLayuiJson_l2> selectSubset(@Param("type") int type);
    List<ToLayuiJson_l1> selectMotherset(@Param("type") int type);
    List<String> selectContains(@Param("level")int level,@Param("depet")String depet,@Param("team")String team);
}
