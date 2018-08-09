package com.test.controller;
import com.alibaba.fastjson.JSONObject;
import com.test.model.CollectingSilverBack;
import com.test.model.FacePayBack;
import com.test.model.OffLine;
import com.test.model.RealPayback;
import com.test.service.Examine;
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
    String strtemp;//预声明一切返回的String类型的对象
    public OffselectService offselectService;
    private OnselectService onselectService;
    private Examine examine;
    //注入service
    @Autowired
    public void setOffselectService(OffselectService offselectService) {
        this.offselectService = offselectService;
    }
    @Autowired
    public void  setOnselectService(OnselectService onselectService){this.onselectService=onselectService;}
    @Autowired
    public void  setExamine(Examine examine){this.examine=examine;}

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
     *  绩效考核查看
     * @param username,month
     * @return
     */
    @RequestMapping(value = "examine1",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements1(String username,String month){
        strtemp = examine.kaohe1(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine2",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements2(String username,String month){
        strtemp = examine.kaohe2(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine3",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements3(String username,String month){
        strtemp = examine.kaohe3(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine4",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements4(String username,String month){
        strtemp = examine.kaohe4(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine5",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements5(String username,String month){
        strtemp = examine.kaohe5(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine6",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements6(String username,String month){
        strtemp = examine.kaohe6(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine7",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements7(String username,String month){
        strtemp = examine.kaohe7(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine8",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements8(String username,String month){
        strtemp = examine.kaohe8(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine9",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements9(String username,String month){
        strtemp = examine.kaohe9(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine10",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements10(String username,String month){
        strtemp = examine.kaohe10(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
 @RequestMapping(value = "examine11",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements11(String username,String month){
        strtemp = examine.kaohe11(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
 @RequestMapping(value = "examine12",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements12(String username,String month){
        strtemp = examine.kaohe12(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
 @RequestMapping(value = "examine13",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements13(String username,String month){
        strtemp = examine.kaohe13(username,month);
        System.out.println(strtemp);
        return strtemp;
    }
    @RequestMapping(value = "examine14",produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String achievements14(String username,String month){
        strtemp = examine.kaohe14(username,month);
        System.out.println(strtemp);
        return strtemp;
    }


    /**
     * 装载每个查询返回的MsgBackJson
     * @param msg_page
     * @param msgBackJson
     * @return MsgBackJson
     */
    private  MsgBackJson getMsgBackJson(List<Object> msg_page, MsgBackJson msgBackJson) {
        if(msg_page.size()==0){
            msgBackJson.setMsg("查无记录");
            return msgBackJson;
        }else {
            msgBackJson.setMsg("");
            msgBackJson.setData(msg_page);
            return msgBackJson;
        }
    }
}
