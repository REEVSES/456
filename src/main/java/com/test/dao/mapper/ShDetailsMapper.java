package com.test.dao.mapper;

import com.test.model.TradeDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program:456
 * @description:各个条线的商户详细信息mapper
 * @author:LiuB
 * @create:2018-08-01 22:58
 */
public interface ShDetailsMapper {
     /*
          查询受理市场的交易明细
      */
     TradeDetails merchantTrade(@Param("merchantNo")String merchantNo, @Param("terminalNo")String terminalNo,@Param("month")String month,@Param("tableName")String tableName);

}
