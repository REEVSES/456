package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.model.GuangDaBack;
import com.test.service.ReportFormService;
import com.test.utils.MsgBackJson;
import com.test.utils.selectClass.GuangDaSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:456
 * @description:各个报表下载信息
 * @author:LiuB
 * @create:2018-08-09 08:41
 */
@Controller
@RequestMapping("/report")
public class ReportForm {
    ReportFormService reportFormService;
    @Autowired
    private void setReportFromService(ReportFormService reportFormService){this.reportFormService = reportFormService;}

    @RequestMapping("guangda")
    @ResponseBody
    public MsgBackJson selectGuangda(String username, String guangDaSelect){
        System.out.println(guangDaSelect);
        JSONObject jsStr = JSONObject.parseObject(guangDaSelect);
        GuangDaSelect requirement= (GuangDaSelect) JSONObject.toJavaObject(jsStr,GuangDaSelect.class);
        List<GuangDaBack> guangDaBacks = reportFormService.selectGuangda(requirement,username);
        List<Object> offLine_page=new ArrayList<Object>();
        MsgBackJson msgBackJson = new MsgBackJson();
        msgBackJson.setCode(0);
        msgBackJson.setCount(guangDaBacks.size());
        System.out.println("love=="+guangDaBacks.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < guangDaBacks.size() - currIdx; i++) {
            GuangDaBack memberArticleBean = guangDaBacks.get(currIdx + i);
            offLine_page.add(memberArticleBean);
        }
        return getMsgBackJson(offLine_page, msgBackJson);
    }

    /**
     * 返回类
     * @param msg_page
     * @param msgBackJson
     * @return
     */
    private MsgBackJson getMsgBackJson(List<Object> msg_page, MsgBackJson msgBackJson) {
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
