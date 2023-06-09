package com.liuyaorong.pattern.FactoryMethod.base;

/**
 * Created by liuyaorong on 2023/6/9
 * 运算操作 - 相除
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getB() == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return getA() / getB();
    }
}