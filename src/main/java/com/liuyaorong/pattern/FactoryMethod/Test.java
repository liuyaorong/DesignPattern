package com.liuyaorong.pattern.FactoryMethod;

import com.liuyaorong.pattern.FactoryMethod.base.Operation;
import com.liuyaorong.pattern.FactoryMethod.factory.AddFactory;
import com.liuyaorong.pattern.FactoryMethod.factory.IFactory;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class Test {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.CreateOption();
        operation.setA(20);
        operation.setB(10);
        System.out.println("相加之后的数: "+ operation.getResult());
    }
}