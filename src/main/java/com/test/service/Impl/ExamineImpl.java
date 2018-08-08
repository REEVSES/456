package com.test.service.Impl;

import com.test.service.Examine;
import com.test.utils.SqlServerConnect;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program:456
 * @description:考核表查询
 * @author:LiuB
 * @create:2018-08-08 20:33
 */
@Service("Examine")
public class ExamineImpl implements Examine {
    SqlServerConnect sqlServerConnect = new SqlServerConnect();
    @Override
    public String kaohe1(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[绩效考核_利润20"+month+"] where  姓名=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe2(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[shsy20"+month+"] where  拓展人=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe3(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from tlzf_syb.dbo.[dmfsy20"+month+"] where  tzr=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe4(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from qdtlzf.dbo.[SIM卡收费20"+month+"] where  拓展人=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe5(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from qdtlzf.dbo.[SIM卡收费20"+month+"] where  提成人=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe6(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[机具销售20"+month+"] where  销售人员=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe7(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[商户新增考核20"+month+"] where  拓展人=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe8(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[绩效考核_维护收入明细20"+month+"] where  维护经理=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe9(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[绩效考核_维护收入明细20"+month+"] where  维护经理=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe10(String username, String month){
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[绩效考核总表\\绩效考核市场区市创新20"+month+"] where  姓名=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe11(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[绩效考核团队市场20"+month+"]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe12(String username, String month) {
        String month_1="";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyMM");
        try {
            Date monthT_1 = simpleDateFormat.parse(month);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(monthT_1);
            calendar.add(Calendar.MONTH, -1);//当前时间前去一个月，即一个月前的时间
            month_1=simpleDateFormat.format(calendar.getTime());//获取一个月前的时间
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            return sqlServerConnect.queryDetials("select id ,部门,团队, a.姓名,isnull([提成合计],0) as 提成合计,[工时奖励],[增量维护奖励],[运维津贴],[奖励金额] as 其他提成, case when [考核得分]>100 then 100 else [考核得分] end  as 得分, case when 上月考核得分>100 then 100 else 上月考核得分 end  as 上月得分,(isnull([提成合计],0)+[工时奖励]+[增量维护奖励]+[运维津贴]+[奖励金额]) / 100 * case WHEN [提成合计]+[工时奖励]+[增量维护奖励]+[运维津贴]+[奖励金额] > 0 then  case when [考核得分]>100 then 100 else [考核得分] end else  case when 上月考核得分>100 then 100 else 上月考核得分 end end as 激励合计,[经营部门管理津贴],[sim卡_提成],[POS销售_提成],[加班费],[ukey_提成],[欠款清缴扣罚],(isnull([提成合计],0)+[工时奖励]+[增量维护奖励]+[运维津贴]+[奖励金额]) / 100 * case WHEN isnull([提成合计],0)+[工时奖励]+[增量维护奖励]+[运维津贴]+[奖励金额] > 0 then  case when [考核得分]>100 then 100 else [考核得分] end else  case when 上月考核得分>100 then 100 else 上月考核得分 end end + [经营部门管理津贴]+[sim卡_提成]+[POS销售_提成]+[加班费]+[ukey_提成]+[欠款清缴扣罚] as 合计,备注  from  kaohe.dbo.绩效考核_利润20"+month+" a  LEFT JOIN (SELECT 姓名, 考核得分 as 上月考核得分 from kaohe.dbo.绩效考核_利润20"+month_1+") b on a.姓名 = b.姓名 where a.姓名 =\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String kaohe13(String username, String month) {
        try {
            return sqlServerConnect.queryDetials("select * from kaohe.dbo.[综合支付预收日结月结后付商户20"+month+"] where  拓展人=\'"+username+"\'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
