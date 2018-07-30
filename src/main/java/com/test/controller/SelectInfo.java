package com.test.controller;
import com.alibaba.fastjson.JSONObject;
import com.test.dao.OffLine;
import com.test.service.OffselectService;
import com.test.utils.selectClass.MerchantSelect;
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
    @Autowired
    public void setOffselectService(OffselectService offselectService) {
        this.offselectService = offselectService;
    }

    @RequestMapping(value = "merchant")
    @ResponseBody
    public List<OffLine> selectShouLi(String username,String merchantSelect){
        JSONObject jsStr = JSONObject.parseObject(merchantSelect);
        MerchantSelect  requirement= (MerchantSelect) JSONObject.toJavaObject(jsStr,MerchantSelect.class);
        List<OffLine> offLine = offselectService.selectShouli(requirement,username);
        List<OffLine> offLine_page=new ArrayList<OffLine>();
        System.out.println("love=="+offLine.size());
        int currIdx = (requirement.getPage() > 1 ? (requirement.getPage() -1) * requirement.getLimit() : 0);
        for (int i = 0; i < requirement.getLimit() && i < offLine.size() - currIdx; i++) {
            OffLine memberArticleBean = offLine.get(currIdx + i);
            offLine_page.add(memberArticleBean);
        }
        return offLine_page;
    }
}
