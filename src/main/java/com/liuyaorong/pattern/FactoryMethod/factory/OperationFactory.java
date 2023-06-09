package com.liuyaorong.pattern.FactoryMethod.factory;

import com.liuyaorong.pattern.FactoryMethod.base.*;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class OperationFactory {

    public static Operation createOperation(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("操作有误, 请确认!");
        }
        Operation operation;
        switch (str) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new IllegalArgumentException("不支持该操作!");
        }
        return operation;
    }
}