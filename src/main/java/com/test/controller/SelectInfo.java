package com.test.controller;
import com.alibaba.fastjson.JSONObject;
import com.test.dao.CollectingSilverBack;
import com.test.dao.FacePayBack;
import com.test.dao.OffLine;
import com.test.dao.RealPayback;
import com.test.service.OffselectService;
import com.test.service.OnselectService;
import com.test.utils.MsgBackJson;
import com.test.utils.selectClass.CollectingSilver;
import com.test.utils.selectClass.FacePay;
import com.test.utils.selectClass.MerchantSelect;
import com.test.utils.selectClass.RealPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/query")
public class SelectInfo {
    public OffselectService offselectService;
    private OnselectService onselectService;
    //注入service
    @Autowired
    public void setOffselectService(OffselectService offselectService) {
        this.offselectService = offselectService;
    }
    @Autowired
    public void  setOnselectService(OnselectService onselectService){this.onselectService=onselectService;}

    /**
     * 受理条线查询控制
     * @param username
     * @param merchantSelect
     * @return MsgBackJson
     */
    @RequestMapping(value = "merchant")
    @ResponseBody
    public MsgBackJson selectShouLi(String username,String merchantSelect){
        System.out.println(merchantSelect);
        JSONObject jsStr = JSONObject.parseObject(merchantSelect);
        MerchantSelect  requirement= (MerchantSelect) JSONObject.toJavaObject(jsStr,MerchantSelect.class);
        List<OffLine> offLine = offselectService.selectShouli(requirement,username);
        List<Object> offLine_page=new ArrayList<Object>();
        MsgBackJson msgBackJson = new MsgBackJson();
        msgBackJson.setCode(0);
        msgBackJson.setCount(offLine.size());
        System.out.println("love=="+offLine.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < offLine.size() - currIdx; i++) {
            OffLine memberArticleBean = offLine.get(currIdx + i);
            offLine_page.add(memberArticleBean);
        }
        return getMsgBackJson(offLine_page, msgBackJson);
    }


    /**
     * 实名付当面付查询控制
     * @param username
     * @param realPay
     * @return MsgBackJson
     */
    @RequestMapping(value = "realpay")
    @ResponseBody
    public MsgBackJson selectRealPay(String username,String realPay){

        JSONObject jsStr = JSONObject.parseObject(realPay);
        RealPay requirement= (RealPay) JSONObject.toJavaObject(jsStr,RealPay.class);
        System.out.printf(requirement.toString());
        List<RealPayback> shiMing = onselectService.selectShiMing(requirement,username);
        List<Object> onLine_page=new ArrayList<Object>();
        MsgBackJson msgBackJson = new MsgBackJson();
        msgBackJson.setCode(0);
        msgBackJson.setCount(shiMing.size());
        System.out.println("love=="+shiMing.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < shiMing.size() - currIdx; i++) {
            RealPayback memberArticleBean = shiMing.get(currIdx + i);
            onLine_page.add(memberArticleBean);
        }
        return getMsgBackJson(onLine_page, msgBackJson);
    }

    /**
     * 收银宝查询控制
     * @param username
     * @param collectingSilver
     * @return MsgBackJson
     */
    @RequestMapping(value = "collectingSilver")
    @ResponseBody
    public MsgBackJson selectCollectingSilver(String username,String collectingSilver){
        JSONObject jsStr = JSONObject.parseObject(collectingSilver);
        CollectingSilver requirement= (CollectingSilver) JSONObject.toJavaObject(jsStr,CollectingSilver.class);
        System.out.printf(requirement.toString());
        List<CollectingSilverBack> shouyin = offselectService.selectShouyin(requirement,username);
        List<Object> msg_page=new ArrayList<Object>();
        MsgBackJson msgBackJson = new MsgBackJson();
        msgBackJson.setCode(0);
        msgBackJson.setCount(shouyin.size());
        System.out.println("love=="+shouyin.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < shouyin.size() - currIdx; i++) {
            CollectingSilverBack memberArticleBean = shouyin.get(currIdx + i);
            msg_page.add(memberArticleBean);
        }
        return getMsgBackJson(msg_page, msgBackJson);
    }

    /**
     * 当面付查询控制
     * @param username
     * @param facePay
     * @return MsgBackJson
     */
    @RequestMapping(value = "facePay")
    @ResponseBody
    public MsgBackJson selectFacePay(String username,String facePay){
        JSONObject jsStr = JSONObject.parseObject(facePay);
        FacePay requirement= (FacePay) JSONObject.toJavaObject(jsStr,FacePay.class);
        System.out.printf(requirement.toString());
        List<FacePayBack> dangMian = offselectService.selectDangMian(requirement,username);
        List<Object> msg_page=new ArrayList<Object>();
        MsgBackJson msgBackJson = new MsgBackJson();
        msgBackJson.setCode(0);
        msgBackJson.setCount(dangMian.size());
        System.out.println("love=="+dangMian.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < dangMian.size() - currIdx; i++) {
            FacePayBack memberArticleBean = dangMian.get(currIdx + i);
            msg_page.add(memberArticleBean);
        }
        return getMsgBackJson(msg_page, msgBackJson);
    }

    /**
     * 装载每个查询返回的MsgBackJson
     * @param msg_page
     * @param msgBackJson
     * @return MsgBackJson
     */
    private MsgBackJson getMsgBackJson(List<Object> msg_page, MsgBackJson msgBackJson) {
        if(msg_page.size()==0){
            msgBackJson.setMsg("查询无记录");
            return msgBackJson;
        }else {
            msgBackJson.setMsg("");
            msgBackJson.setData(msg_page);
            return msgBackJson;
        }
    }

}
