package com.test.controller;
import com.test.model.TradeDetails;
import com.test.service.ShDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    Date date = new Date();//获取时间
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
        //System.out.printf(mDetailsBack);
        return mDetailsBack;
    }
    /**
     * 受理市场某月某商户号下的交易信息
     * @param merchantNo
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "merchantMonthTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public List<TradeDetails> merchantMonthTrade(String merchantNo,String month,String tablename)  {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
        //String month = dateFormat.format(date);
        List<TradeDetails> mDetailsBack=shDetialsService.merchantTrade(merchantNo,month,tablename);
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
     * 网络条线某月某商户号下的交易记录
     * @param merchantNo
     * @return
     */
    @RequestMapping(value = "onlineMonthTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public List<TradeDetails> onLineMonthTrade(String merchantNo,String month)  {
        List<TradeDetails> mDetailsBack=shDetialsService.bianjieTrade(merchantNo,month);
        List<TradeDetails> mDetailsBack2=shDetialsService.dangmianTrade(merchantNo,month);
        mDetailsBack.addAll(mDetailsBack2);
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
     * 收银宝条线某月某商户号下的交易记录
     * @param merchantNo
     * @return
     */
    @RequestMapping(value = "csMonthTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public List<TradeDetails> csilverMonthTrade(String merchantNo,String month)  {
        List<TradeDetails> mDetailsBack=shDetialsService.csMonthTrade(merchantNo,month);
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
    /**
     * 当面付条线某月某商户号下的交易记录
     * @param merchantNo
     * @return
     */
    @RequestMapping(value = "faceMonthTrade",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public List<TradeDetails> faceMonthTrade(String merchantNo,String month)  {
        List<TradeDetails> mDetailsBack=shDetialsService.faceMonthTrade(merchantNo,month);
        return mDetailsBack;
    }
}
