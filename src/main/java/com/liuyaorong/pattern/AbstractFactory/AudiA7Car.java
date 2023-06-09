package com.liuyaorong.pattern.AbstractFactory;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class AudiA7Car implements AudiCar {

    @Override
    public void gasUp() {
        System.out.println("给我的奥迪A7加满油");
    }
}