package com.liuyaorong.pattern.Strategy;

import org.springframework.stereotype.Service;

/**
 * Created by liuyaorong on 2023/7/12
 */
@Service
public class WxpayPayService extends AbstractPayService {

    @Override
    public void doPay(PayRequest payRequest) {
        // 执行微信支付处理逻辑
    }
}