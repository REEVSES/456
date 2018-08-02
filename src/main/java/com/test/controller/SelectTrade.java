package com.test.controller;

import com.test.service.ShDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program:456
 * @description:单击显示商户详细信息以及交易记录查询
 * @author:LiuB
 * @create:2018-08-01 21:39
 */
@Controller
@RequestMapping(value = "/tradeInfo")
public class SelectTrade {
    private ShDetialsService shDetialsService;
    @Autowired
    public void setShDetialsService(ShDetialsService shDetialsService){this.shDetialsService=shDetialsService;}

    /**
     * 受理市场详细信息
     * @param merchantNo
     * @param terminalNo
     * @return
     */
    @RequestMapping(value = "merchantTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String merchantDetails(String merchantNo,String terminalNo) throws Exception {
        String mDetailsBack=shDetialsService.merchantDetails(merchantNo,terminalNo);
       // System.out.printf(mDetailsBack);
        return mDetailsBack;
    }
    /**
     * 网络条线详细信息
     * @param merchantNo
     * @param terminalNo
     * @return
     */
    @RequestMapping(value = "onlineTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String onlinePayDetails(String merchantNo,String terminalNo) throws Exception {
        String mDetailsBack=shDetialsService.onlineDetails(merchantNo,terminalNo);
        return mDetailsBack;
    }

    /**
     * 收银宝详细信息
     * @param merchantNo
     * @param terminalNo
     * @return
     */
    @RequestMapping(value = "collectingsilverTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String collectingSilverDetails(String merchantNo,String terminalNo) throws Exception {
        String mDetailsBack=shDetialsService.collectingSilverDetails(merchantNo,terminalNo);
        return mDetailsBack;
    }

    /**
     * 当面付条线详细信息
     * @param merchantNo
     * @return
     */
    @RequestMapping(value = "faceTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String facePayDetails(String merchantNo) throws Exception {
        String mDetailsBack=shDetialsService.facePayDetails(merchantNo);
        return mDetailsBack;
    }
}
