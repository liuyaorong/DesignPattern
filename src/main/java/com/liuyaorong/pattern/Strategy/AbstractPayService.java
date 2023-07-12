package com.liuyaorong.pattern.Strategy;

/**
 * Created by liuyaorong on 2023/7/12
 */
public abstract class AbstractPayService implements PayService {

    @Override
    public void doPay(PayRequest payRequest) {
        validateRequest(payRequest);
        pay(payRequest);
        postPay(payRequest);
    }

    public void validateRequest(PayRequest payRequest) {
        // 支付前校验
    }
    public void pay(PayRequest payRequest) {

    }
    private void postPay(PayRequest payRequest) {
        // 支付成功后置处理
    }
}
