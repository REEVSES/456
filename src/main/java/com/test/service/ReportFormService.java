package com.test.service;


import com.test.model.GuangDaBack;
import com.test.utils.selectClass.GuangDaSelect;

import java.util.List;

/**
 * @program:456
 * @description:报表处理
 * @author:LiuB
 * @create:2018-08-09 08:42
 */
public interface ReportFormService {

    List<GuangDaBack> selectGuangda(GuangDaSelect requirement, String username);
}
