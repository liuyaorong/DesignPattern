package com.liuyaorong.pattern.Singleton.lazy;

/**
 * Created by liuyaorong on 2023/6/8
 * 懒汉模式 - 非线程安全
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}