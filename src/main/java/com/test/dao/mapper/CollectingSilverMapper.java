package com.test.dao.mapper;

import com.test.dao.CollectingSilverBack;
import com.test.utils.selectClass.CollectingSilver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program:456
 * @description:收银宝sql映射
 * @author:LiuB
 * @create:2018-07-31 16:47
 */
public interface CollectingSilverMapper {
    List<CollectingSilverBack> selectShouyin(@Param("tiaojian")CollectingSilver collectingSilver, @Param("username") String username);
}
