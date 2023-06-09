package com.liuyaorong.pattern.AbstractFactory;

/**
 * Created by liuyaorong on 2023/6/9
 * 特斯拉电车 - Model Y
 */
public class TeslaModelYCar implements TeslaCar {

    @Override
    public void charge() {
        System.out.println("给我的特斯拉Model Y充满电");
    }
}