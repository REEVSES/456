package com.test.service;
import com.test.dao.OffLine;
import com.test.dao.OffLineMapper;
import com.test.utils.selectClass.MerchantSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:456
 * @description:线下条线数据查询信息实现
 * @author:LiuB
 * @create:2018-07-27 13:55
 */

@Service("OffselectService")
public class OffselectServiceImpl implements OffselectService{

    private OffLineMapper offLineMapper;
    @Autowired
    public void setOffLineMapper(OffLineMapper offLineMapper) {
        this.offLineMapper = offLineMapper;
    }
    @Override
    public List<OffLine> selectShouli(MerchantSelect merchantSelect, String username) {
        return offLineMapper.selectShouli(merchantSelect,username);
    }
}
