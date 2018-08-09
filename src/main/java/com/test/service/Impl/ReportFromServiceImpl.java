package com.test.service.Impl;


import com.test.model.GuangDaBack;
import com.test.service.ReportFormService;
import com.test.utils.selectClass.GuangDaSelect;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:456
 * @description:报表业务实现类
 * @author:LiuB
 * @create:2018-08-09 08:43
 */
@Service("ReportFormService")
public class ReportFromServiceImpl implements ReportFormService {

    @Override
    public List<GuangDaBack> selectGuangda(GuangDaSelect requirement, String username) {
        return null;
    }
}
