package com.liuyaorong.pattern.Strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuyaorong on 2023/7/12
 */
@Service
public class PayDomainService {

    @Autowired
    private PayServiceFactory payServiceFactory;

    public void pay(PayRequest payRequest) throws IllegalAccessException {
        String payMethod = payRequest.getPayMethod();
        if (payMethod == null || "".equals(payMethod)) {
            throw new IllegalAccessException("支付方式为空");
        }
        payServiceFactory.getPayService(payMethod).doPay(payRequest);
    }
}