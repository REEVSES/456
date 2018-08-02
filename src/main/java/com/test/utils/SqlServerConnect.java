package com.test.utils;


import java.sql.*;
import java.util.ArrayList;

/**
 * @program:456
 * @description:单独链接数据信息读取
 * @author:LiuB
 * @create:2018-08-02 14:23
 */

public class SqlServerConnect
{
    public String queryDetials(String sql) throws Exception
    {//实现对数据库的访问
        Connection conn = null;
        String backdata="";
        StringBuffer str= new StringBuffer();
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
            String dbURL = "jdbc:sqlserver://10.71.254.6:1433;DatabaseName=master";  //连接服务器和数据库sample
            String userName = "simon";
            String userPwd = "simon563";
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL, userName, userPwd);
            if(conn!=null)
            {
                System.out.println("Sqlserver Connection Successful!");  //如果连接成功 控制台输出
            }
            else{

                System.out.println("Sqlserver Connection fail!");
                return "凉了，没查到";
            }
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);//定义ResultSet类，用于接收获取的数据
            ResultSetMetaData data = rs.getMetaData();
            while (rs.next())
            {
                backdata="\""+data.getColumnLabel(1)+"\":\""+rs.getString(1)+"\"";
                for(int i=2;i<data.getColumnCount()+1;i++){
                    backdata=backdata + ",\""+data.getColumnLabel(i)+"\":\""+rs.getString(i)+"\"";
                }
                System.out.println(backdata);
            }
            rs.close();
            stat.close();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            try
            {//关闭连接
                if(conn!=null)
                {
                    conn.close();
                    conn=null;
                }
            }
            catch(Exception ex)
            {
            }
        }
        return "{"+backdata+"}";

    }
}
