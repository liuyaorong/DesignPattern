package com.liuyaorong.pattern.Singleton.doublecheck;

/**
 * Created by liuyaorong on 2023/6/8
 */
public class VolatileSingleton {

    private static volatile VolatileSingleton singleton;

    private VolatileSingleton() {

    }

    public static VolatileSingleton getInstance() {
        if (singleton == null) {
            synchronized (VolatileSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileSingleton();
                }
            }
        }
        return singleton;
    }
}