package com.liuyaorong.pattern.Strategy;

import org.springframework.stereotype.Service;

/**
 * Created by liuyaorong on 2023/7/12
 * @description: 支付宝支付服务
 */
@Service
public class AlipayPayService extends AbstractPayService {
    @Override
    public void doPay(PayRequest payRequest) {
        // 执行支付宝支付处理逻辑
    }
}