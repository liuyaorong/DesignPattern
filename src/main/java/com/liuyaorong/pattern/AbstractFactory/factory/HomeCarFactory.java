package com.liuyaorong.pattern.AbstractFactory.factory;

import com.liuyaorong.pattern.AbstractFactory.AudiA7Car;
import com.liuyaorong.pattern.AbstractFactory.AudiCar;
import com.liuyaorong.pattern.AbstractFactory.TeslaCar;
import com.liuyaorong.pattern.AbstractFactory.TeslaModelYCar;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class HomeCarFactory implements CarFactory {
    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaModelYCar();
    }

    @Override
    public AudiCar getAudiCar() {
        return new AudiA7Car();
    }
}