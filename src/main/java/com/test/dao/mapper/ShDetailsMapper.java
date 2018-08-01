package com.test.dao.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @program:456
 * @description:各个条线的商户详细信息mapper
 * @author:LiuB
 * @create:2018-08-01 22:58
 */
public interface ShDetailsMapper {
    public String merchantDetials(@Param("merchantNo")String merchantNo,@Param("terminalNo")String terminalNo);
}
