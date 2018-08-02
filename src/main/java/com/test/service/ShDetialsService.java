package com.test.service;/*
 * @program:456
 * @description:各个条线的商户信息以及交易信息查询
 * @author:LiuB
 * @create:2018-08-01 22:45
 */

public interface ShDetialsService {
    String merchantDetails(String merchantNo, String terminalNo) throws Exception;
    String onlineDetails(String merchantNo, String terminalNo) throws Exception;
    String collectingSilverDetails(String merchantNo, String terminalNo) throws Exception;
    String facePayDetails(String merchantNo) throws Exception;
}