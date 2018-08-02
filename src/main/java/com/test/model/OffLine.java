package com.test.model;
import java.sql.Date;

/**
 * 受理市场返回信息
 */
public class OffLine {
    private String merchantNo;
    private String terminalNo;
    private String business_registration_name;
    private String store_business_name;
    private Date signon_time;
    private String source_channel;
    private String guardian;
    private String business_state;
    private String terminal_state;

    @Override
    public String toString() {
        return "OffLine{" +
                "merchantNo='" + merchantNo + '\'' +
                ", terminalNo='" + terminalNo + '\'' +
                ", business_registration_name='" + business_registration_name + '\'' +
                ", store_business_name='" + store_business_name + '\'' +
                ", signon_time='" + signon_time + '\'' +
                ", source_channel='" + source_channel + '\'' +
                ", guardian='" + guardian + '\'' +
                ", business_state='" + business_state + '\'' +
                ", terminal_state='" + terminal_state + '\'' +
                '}';
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public String getBusiness_registration_name() {
        return business_registration_name;
    }

    public void setBusiness_registration_name(String business_registration_name) {
        this.business_registration_name = business_registration_name;
    }

    public String getStore_business_name() {
        return store_business_name;
    }

    public void setStore_business_name(String store_business_name) {
        this.store_business_name = store_business_name;
    }

    public Date getSignon_time() {
        return signon_time;
    }

    public void setSignon_time(Date signon_time) {
        this.signon_time = signon_time;
    }

    public String getSource_channel() {
        return source_channel;
    }

    public void setSource_channel(String source_channel) {
        this.source_channel = source_channel;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getBusiness_state() {
        return business_state;
    }

    public void setBusiness_state(String business_state) {
        this.business_state = business_state;
    }

    public String getTerminal_state() {
        return terminal_state;
    }

    public void setTerminal_state(String terminal_state) {
        this.terminal_state = terminal_state;
    }
}
