package com.test.service.Impl;
import com.test.dao.mapper.RealPayMapper;
import com.test.dao.RealPayback;
import com.test.service.OnselectService;
import com.test.utils.selectClass.RealPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @program:456
 * @description:线上条线数据查询接口
 * @author:LiuB
 * @create:2018-07-27 14:01
 */
@Service("OnselectService")
public class OnselectServiceImpl implements OnselectService {
    private RealPayMapper realPayMapper;
    //注入实名付mapper映射
    @Autowired
    public  void setRealPayMapper(RealPayMapper realPayMapper){this.realPayMapper=realPayMapper;}
    @Override
    public List<RealPayback> selectShiMing(RealPay realPay, String username) {
        return realPayMapper.selectShiming(realPay,username);
    }
}
