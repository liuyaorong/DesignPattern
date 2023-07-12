package com.liuyaorong.pattern.Strategy;

/**
 * Created by liuyaorong on 2023/7/12
 * @description: 支付请求实体
 */
public class PayRequest {

    /**
     * 支付方式
     */
    private String payMethod;

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
