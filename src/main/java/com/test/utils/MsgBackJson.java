package com.test.utils;
import java.util.List;
/**
 * @program:456
 * @description:查询信息返回的json
 * @author:LiuB
 * @create:2018-07-31 16:42
 */
public class MsgBackJson {
    private int code;
    private String msg;
    private long count;
    List<Object> data;

    @Override
    public String toString() {
        return "MsgBackJson{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}