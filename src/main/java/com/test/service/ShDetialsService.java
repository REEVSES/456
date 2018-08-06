package com.test.service;/*
 * @program:456
 * @description:各个条线的商户信息以及交易信息查询
 * @author:LiuB
 * @create:2018-08-01 22:45
 */

import com.test.model.TradeDetails;

import java.util.List;

public interface ShDetialsService {
    //商户详细信息显示接口
    String merchantDetails(String merchantNo, String terminalNo) throws Exception;
    String onlineDetails(String merchantNo, String terminalNo) throws Exception;
    String collectingSilverDetails(String merchantNo, String terminalNo) throws Exception;
    String facePayDetails(String merchantNo) throws Exception;
    //各个条线的商户号下交易明细查询
    List<TradeDetails> merchantTrade(String merchantNo,String month,String tablename);
    List<TradeDetails> csMonthTrade(String merchantNo, String month);
    List<TradeDetails> faceMonthTrade(String merchantNo, String month);
    List<TradeDetails> bianjieTrade(String merchantNo, String month);
    List<TradeDetails> dangmianTrade(String merchantNo, String month);
}
