package com.test.controller;

import com.test.service.ShDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program:456
 * @description:某商户详细信息以及交易记录查询
 * @author:LiuB
 * @create:2018-08-01 21:39
 */
@Controller
@RequestMapping(value = "/tradeInfo")
public class SelectTrade {
    private ShDetialsService shDetialsService;
    @Autowired
    public void setShDetialsService(ShDetialsService shDetialsService){this.shDetialsService=shDetialsService;}

    @RequestMapping("merchantTrade")
    @ResponseBody
    public String merchantDetails(String merchantNo,String terminalNo){
        String mDetailsBack=shDetialsService.merchantDetails(merchantNo,terminalNo);
        return mDetailsBack;
    }
}
