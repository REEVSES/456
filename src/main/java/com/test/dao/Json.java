package com.test.dao;

/**
 * json登录信息返回判断
 */
public class Json {
    private String status;
    private Object info;

    public Json(String status, Object info) {
        this.status = status;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Json{" +
                "status='" + status + '\'' +
                ", info=" + info +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
