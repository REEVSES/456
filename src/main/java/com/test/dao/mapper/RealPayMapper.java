package com.test.dao.mapper;

import com.test.dao.RealPayback;
import com.test.utils.selectClass.RealPay;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @program:456
 * @description:实名付查询返回实体类映射接口
 * @author:LiuB
 * @create:2018-07-31 10:12
 */
public interface RealPayMapper {
    List<RealPayback> selectShiming(@Param("tiaojian")RealPay realPay, @Param("username") String username);
}
