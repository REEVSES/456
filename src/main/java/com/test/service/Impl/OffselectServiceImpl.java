package com.test.service.Impl;
import com.test.dao.CollectingSilverBack;
import com.test.dao.FacePayBack;
import com.test.dao.mapper.CollectingSilverMapper;
import com.test.dao.OffLine;
import com.test.dao.mapper.FacePayMapper;
import com.test.dao.mapper.OffLineMapper;
import com.test.service.OffselectService;
import com.test.utils.selectClass.CollectingSilver;
import com.test.utils.selectClass.FacePay;
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
public class OffselectServiceImpl implements OffselectService {

    private OffLineMapper offLineMapper;
    private CollectingSilverMapper collectingSilverMapper;
    private FacePayMapper facePayMapper;
    @Autowired
    public void setOffLineMapper(OffLineMapper offLineMapper) {
        this.offLineMapper = offLineMapper;
    }
    @Autowired
    public void setCollectingSilverMapper(CollectingSilverMapper collectingSilverMapper) {
        this.collectingSilverMapper = collectingSilverMapper;
    }
    @Autowired
    public void setFacePayMapper(FacePayMapper facePayMapper){
        this.facePayMapper=facePayMapper;
    };
    @Override
    public List<OffLine> selectShouli(MerchantSelect merchantSelect, String username) {
        return offLineMapper.selectShouli(merchantSelect,username);
    }
    @Override
    public List<CollectingSilverBack> selectShouyin(CollectingSilver requirement, String username) {
        return collectingSilverMapper.selectShouyin(requirement,username);
    }

    @Override
    public List<FacePayBack> selectDangMian(FacePay requirement, String username) {
        return facePayMapper.selectDangMianFu(requirement,username);
    }
}
