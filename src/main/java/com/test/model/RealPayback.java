package com.test.model;

import java.sql.Date;

/**
 * @program:456
 * @description:实名付查询返回实体DAO
 * @author:LiuB
 * @create:2018-07-31 17:23
 */
public class RealPayback {
    private String merchantNo;
    private String business_registration_name;
    private String terminalNo;
    private String terminal_state;
    private String guardian;
    private String level1;
    private String level2;
    private String source_channel;
    private Date signon_time;
    private String business_type;
    private String business_state;

    @Override
    public String toString() {
        return "RealPay{" +
                "merchantNo='" + merchantNo + '\'' +
                ", business_registration_name='" + business_registration_name + '\'' +
                ", terminalNo='" + terminalNo + '\'' +
                ", terminal_state='" + terminal_state + '\'' +
                ", guardian='" + guardian + '\'' +
                ", level1='" + level1 + '\'' +
                ", level2='" + level2 + '\'' +
                ", source_channel='" + source_channel + '\'' +
                ", signon_time=" + signon_time +
                ", business_type='" + business_type + '\'' +
                ", business_state='" + business_state + '\'' +
                '}';
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBusiness_registration_name() {
        return business_registration_name;
    }

    public void setBusiness_registration_name(String business_registration_name) {
        this.business_registration_name = business_registration_name;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public String getTerminal_state() {
        return terminal_state;
    }

    public void setTerminal_state(String terminal_state) {
        this.terminal_state = terminal_state;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getSource_channel() {
        return source_channel;
    }

    public void setSource_channel(String source_channel) {
        this.source_channel = source_channel;
    }

    public Date getSignon_time() {
        return signon_time;
    }

    public void setSignon_time(Date signon_time) {
        this.signon_time = signon_time;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getBusiness_state() {
        return business_state;
    }

    public void setBusiness_state(String business_state) {
        this.business_state = business_state;
    }
}
