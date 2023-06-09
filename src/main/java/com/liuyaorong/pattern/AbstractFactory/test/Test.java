package com.liuyaorong.pattern.AbstractFactory.test;

import com.liuyaorong.pattern.AbstractFactory.TeslaCar;
import com.liuyaorong.pattern.AbstractFactory.factory.HomeCarFactory;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class Test {

    public static void main(String[] args) {
        HomeCarFactory factory = new HomeCarFactory();
        TeslaCar teslaCar = factory.getTeslaCar();
        teslaCar.charge();
    }
}