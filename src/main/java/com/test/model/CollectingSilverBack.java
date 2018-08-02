package com.test.model;

/**
 * @program:456
 * @description:收银宝返回查询
 * @author:LiuB
 * @create:2018-07-31 16:33
 */
public class CollectingSilverBack {
    private String merchant_num;
    private String terminal_num;
    private String business_registration_name;
    private String merchant_signon_time;
    private String terminal_signon_time;
    private String guardian;
    private String source_channel;
    private String terminal_state;
    private String contact;
    private String contact_num;

    @Override
    public String toString() {
        return "CollectingSilverBack{" +
                "merchant_num='" + merchant_num + '\'' +
                ", terminal_num='" + terminal_num + '\'' +
                ", business_registration_name='" + business_registration_name + '\'' +
                ", merchant_signon_time='" + merchant_signon_time + '\'' +
                ", terminal_signon_time='" + terminal_signon_time + '\'' +
                ", guardian='" + guardian + '\'' +
                ", source_channel='" + source_channel + '\'' +
                ", terminal_state='" + terminal_state + '\'' +
                ", contact='" + contact + '\'' +
                ", contact_num='" + contact_num + '\'' +
                '}';
    }

    public String getMerchant_num() {
        return merchant_num;
    }

    public void setMerchant_num(String merchant_num) {
        this.merchant_num = merchant_num;
    }

    public String getTerminal_num() {
        return terminal_num;
    }

    public void setTerminal_num(String terminal_num) {
        this.terminal_num = terminal_num;
    }

    public String getBusiness_registration_name() {
        return business_registration_name;
    }

    public void setBusiness_registration_name(String business_registration_name) {
        this.business_registration_name = business_registration_name;
    }

    public String getMerchant_signon_time() {
        return merchant_signon_time;
    }

    public void setMerchant_signon_time(String merchant_signon_time) {
        this.merchant_signon_time = merchant_signon_time;
    }

    public String getTerminal_signon_time() {
        return terminal_signon_time;
    }

    public void setTerminal_signon_time(String terminal_signon_time) {
        this.terminal_signon_time = terminal_signon_time;
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

    public String getTerminal_state() {
        return terminal_state;
    }

    public void setTerminal_state(String terminal_state) {
        this.terminal_state = terminal_state;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_num() {
        return contact_num;
    }

    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }
}
