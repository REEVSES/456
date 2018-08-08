package com.test.model;

/**
 * @program:456
 * @description:交易信息结果返回
 * @author:LiuB
 * @create:2018-08-02 18:46
 */
public class TradeDetails {
    private String tradeTime;//交易时间
    private String tradeCount;//交易笔数
    private String tradeAmount;//交易金额
    private String tradeCharge;//手续费
    private String tradeProfit;//收益

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(String tradeCount) {
        this.tradeCount = tradeCount;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeCharge() {
        return tradeCharge;
    }

    public void setTradeCharge(String tradeCharge) {
        this.tradeCharge = tradeCharge;
    }

    public String getTradeProfit() {
        return tradeProfit;
    }

    public void setTradeProfit(String tradeProfit) {
        this.tradeProfit = tradeProfit;
    }
}
