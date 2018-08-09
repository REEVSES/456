package com.test.utils.selectClass;

/**
 * @program:456
 * @description:广大返回的参数形式
 * @author:LiuB
 * @create:2018-08-09 09:08
 */
public class GuangDaSelect {
    private String merchant_num;
    private String business_registration_name;
    private String guardian;
    private String source_channel;
    private Integer page;
    private Integer limit;

    @Override
    public String toString() {
        return "GuangDaSelect{" +
                "merchant_num='" + merchant_num + '\'' +
                ", business_registration_name='" + business_registration_name + '\'' +
                ", guardian='" + guardian + '\'' +
                ", source_channel='" + source_channel + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }

    public String getMerchant_num() {
        return merchant_num;
    }

    public void setMerchant_num(String merchant_num) {
        this.merchant_num = merchant_num;
    }

    public String getBusiness_registration_name() {
        return business_registration_name;
    }

    public void setBusiness_registration_name(String business_registration_name) {
        this.business_registration_name = business_registration_name;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getSource_channel() {
        return source_channel;
    }

    public void setSource_channel(String source_channel) {
        this.source_channel = source_channel;
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
