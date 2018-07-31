package com.test.dao;

/**
 * @program:456
 * @description:当面付返回类
 * @author:LiuB
 * @create:2018-07-31 17:34
 */
public class FacePayBack {
    private String merchant_num;
    private String merchant_name;
    private String source_channel;
    private String bind_time;
    private String merchant_state;
    private String gg_time;

    @Override
    public String toString() {
        return "FacePayBack{" +
                "merchant_num='" + merchant_num + '\'' +
                ", merchant_name='" + merchant_name + '\'' +
                ", source_channel='" + source_channel + '\'' +
                ", bind_time='" + bind_time + '\'' +
                ", merchant_state='" + merchant_state + '\'' +
                ", gg_time='" + gg_time + '\'' +
                '}';
    }

    public String getMerchant_num() {
        return merchant_num;
    }

    public void setMerchant_num(String merchant_num) {
        this.merchant_num = merchant_num;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getSource_channel() {
        return source_channel;
    }

    public void setSource_channel(String source_channel) {
        this.source_channel = source_channel;
    }

    public String getBind_time() {
        return bind_time;
    }

    public void setBind_time(String bind_time) {
        this.bind_time = bind_time;
    }

    public String getMerchant_state() {
        return merchant_state;
    }

    public void setMerchant_state(String merchant_state) {
        this.merchant_state = merchant_state;
    }

    public String getGg_time() {
        return gg_time;
    }

    public void setGg_time(String gg_time) {
        this.gg_time = gg_time;
    }
}
