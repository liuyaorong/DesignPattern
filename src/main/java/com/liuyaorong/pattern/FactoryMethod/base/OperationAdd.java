package com.liuyaorong.pattern.FactoryMethod.base;

/**
 * Created by liuyaorong on 2023/6/9
 * 运算操作 - 相加
 */
public class OperationAdd extends Operation{

    @Override
    public double getResult() {
        return getA() + getB();
    }
}