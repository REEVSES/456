package com.test.service;

import com.test.model.RealPayback;
import com.test.utils.selectClass.RealPay;

import java.util.List;

/**
 * @program:456
 * @description:线上条线数据查询接口
 * @author:LiuB
 * @create:2018-07-27 13:57
 */

public interface OnselectService {
    //实名付条线
    List<RealPayback> selectShiMing(RealPay realPay, String username);
}
