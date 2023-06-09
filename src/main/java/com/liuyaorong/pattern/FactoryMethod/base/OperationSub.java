package com.liuyaorong.pattern.FactoryMethod.base;

/**
 * Created by liuyaorong on 2023/6/9
 * 运算操作 - 相减
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getA() - getB();
    }
}
