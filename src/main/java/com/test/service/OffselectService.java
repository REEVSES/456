package com.test.service;

import com.test.dao.OffLine;
import com.test.utils.selectClass.MerchantSelect;

import java.util.List;

/**
 * @program:456
 * @description:线下条线数据信息查询接口
 * @author:LiuB
 * @create:2018-07-27 13:53
 */

public interface OffselectService {
    List<OffLine> selectShouli(MerchantSelect merchantSelect, String username);
}
