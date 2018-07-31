package com.test.dao.mapper;/*
 * @program:456
 * @description:当面付sql映射接口
 * @author:LiuB
 * @create:2018-07-31 17:46
 */

import com.test.dao.FacePayBack;
import com.test.utils.selectClass.FacePay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FacePayMapper {
    List<FacePayBack> selectDangMianFu(@Param("tiaojian")FacePay facePay,@Param("username") String username);
}
