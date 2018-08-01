package com.test.service.Impl;

import com.test.dao.mapper.ShDetailsMapper;
import com.test.service.ShDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:456
 * @description:条线商户详细信息的实现类
 * @author:LiuB
 * @create:2018-08-01 22:57
 */
@Service("ShDetialsService")
public class ShDetialsServiceImpl implements ShDetialsService {
    private ShDetailsMapper shDetailsMapper;
    @Autowired
    public void setShDetailsMapper(ShDetailsMapper shDetailsMapper){this.shDetailsMapper=shDetailsMapper;}
    @Override
    public String merchantDetails(String merchantNo, String terminalNo) {
        return shDetailsMapper.merchantDetials(merchantNo,terminalNo);
    }
}
