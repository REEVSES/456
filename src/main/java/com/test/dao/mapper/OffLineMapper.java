package com.test.dao.mapper;
import com.test.dao.OffLine;
import com.test.utils.selectClass.MerchantSelect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program:456
 * @description:线上条线测试
 * @author:LiuB
 * @create:2018-07-30 11:20
 */
public interface OffLineMapper {
    List<OffLine> selectShouli(@Param("tiaojian")MerchantSelect tiaojian, @Param("username")String username);
}
