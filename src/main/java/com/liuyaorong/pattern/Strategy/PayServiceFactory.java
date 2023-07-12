package com.liuyaorong.pattern.Strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liuyaorong on 2023/7/12
 */
@Service
public class PayServiceFactory {

    @Autowired
    private Map<String, PayService> payServiceMap = new ConcurrentHashMap<>();

    public PayService getPayService(String payMethod) {
        // 支付方式  PayMethod(如: Alipay、Wxpay等)
        return payServiceMap.get(payMethod + "PayService");
    }
}