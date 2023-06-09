package com.liuyaorong.pattern.AbstractFactory.factory;

import com.liuyaorong.pattern.AbstractFactory.AudiCar;
import com.liuyaorong.pattern.AbstractFactory.TeslaCar;

/**
 * Created by liuyaorong on 2023/6/9
 * 工厂接口
 */
public interface CarFactory {

    TeslaCar getTeslaCar();
    AudiCar getAudiCar();
}