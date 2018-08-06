package com.test.service.Impl;
import com.test.dao.mapper.ShDetailsMapper;
import com.test.model.TradeDetails;
import com.test.service.ShDetialsService;
import com.test.utils.SqlServerConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:456
 * @description:条线商户详细信息的类
 * @author:LiuB
 * @create:2018-08-01 22:57
 */
@Service("ShDetialsService")
public class ShDetialsServiceImpl implements ShDetialsService {
    private ShDetailsMapper shDetailsMapper;
    @Autowired
    public void setShDetailsMapper(ShDetailsMapper shDetailsMapper){this.shDetailsMapper=shDetailsMapper;}
    @Override
    public String merchantDetails(String merchantNo, String terminalNo) throws Exception {
        SqlServerConnect sqlServerConnect = new SqlServerConnect();
        return sqlServerConnect.queryDetials("select * from qdtlzf.dbo.Merchant where  收单商户编码=\'"+merchantNo+"\' and 终端编号=\'"+terminalNo+"\'");
    }
    @Override
    public String onlineDetails(String merchantNo, String terminalNo) throws Exception {
        SqlServerConnect sqlServerConnect = new SqlServerConnect();
        return sqlServerConnect.queryDetials("select * from   smzf.dbo.网络支付终端信息1403 where 商户号=\'"+merchantNo+"\' and 终端号=\'"+terminalNo+"\'");
    }
    @Override
    public String collectingSilverDetails(String merchantNo, String terminalNo) throws Exception {
        SqlServerConnect sqlServerConnect = new SqlServerConnect();
        return sqlServerConnect.queryDetials("select * from [tlzf_syb].[dbo].[sybsh] where  商户号=\'"+merchantNo+"\' and 终端号=\'"+terminalNo+"\'");
    }
    @Override
    public String facePayDetails(String merchantNo) throws Exception {
        SqlServerConnect sqlServerConnect = new SqlServerConnect();
        return sqlServerConnect.queryDetials("select * from [tlzf_syb].[dbo].[merrecord] where  商户号=\'"+merchantNo+"\'");
    }

    @Override
    public List<TradeDetails> merchantTrade(String merchantNo, String month,String tablename) {
        return shDetailsMapper.merchantTrade(merchantNo,month,tablename);
    }



    @Override
    public List<TradeDetails> csMonthTrade(String merchantNo, String month) {
        return shDetailsMapper.csMonthTrade(merchantNo,month);
    }

    @Override
    public List<TradeDetails> faceMonthTrade(String merchantNo, String month) {
        return shDetailsMapper.faceMonthTrade(merchantNo,month);
    }

    @Override
    public List<TradeDetails> bianjieTrade(String merchantNo, String month) {
        return shDetailsMapper.bianjieTrade(merchantNo,month);
    }

    @Override
    public List<TradeDetails> dangmianTrade(String merchantNo, String month) {
        return shDetailsMapper.dangmianTrade(merchantNo,month);
    }
}
