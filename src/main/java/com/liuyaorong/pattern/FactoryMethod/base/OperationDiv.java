package com.liuyaorong.pattern.FactoryMethod.base;

/**
 * Created by liuyaorong on 2023/6/9
 * 运算操作 - 相除
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return getA() / getB();
    }
}