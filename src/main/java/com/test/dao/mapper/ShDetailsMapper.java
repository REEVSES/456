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
     //查询受理市场的交易明细
     List<TradeDetails> merchantTrade(@Param("merchantNo")String merchantNo,@Param("month")String month,@Param("tablename")String tablename);
     //查询线上条线的交易明细
     List<TradeDetails> bianjieTrade(@Param("merchantNo")String merchantNo,@Param("month")String month);
     List<TradeDetails> dangmianTrade(@Param("merchantNo")String merchantNo,@Param("month")String month);
     //查询收银宝条线的交易明细
     List<TradeDetails> csMonthTrade(@Param("merchantNo")String merchantNo,@Param("month")String month);
     //查询当面付条线的交易明细
     List<TradeDetails> faceMonthTrade(@Param("merchantNo")String merchantNo,@Param("month")String month);
}
