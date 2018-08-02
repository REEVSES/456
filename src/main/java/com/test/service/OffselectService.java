package com.test.service;

import com.test.model.CollectingSilverBack;
import com.test.model.FacePayBack;
import com.test.model.OffLine;
import com.test.utils.selectClass.CollectingSilver;
import com.test.utils.selectClass.FacePay;
import com.test.utils.selectClass.MerchantSelect;

import java.util.List;

/**
 * @program:456
 * @description:线下条线数据信息查询接口
 * @author:LiuB
 * @create:2018-07-27 13:53
 */

public interface OffselectService {
    //受理市场
    List<OffLine> selectShouli(MerchantSelect merchantSelect, String username);

    //收银宝
    List<CollectingSilverBack> selectShouyin(CollectingSilver requirement, String username);

    //当面付
    List<FacePayBack> selectDangMian(FacePay requirement, String username);
}
