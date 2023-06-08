package com.liuyaorong.pattern.Singleton.doublecheck;

/**
 * Created by liuyaorong on 2023/6/8
 * 双重检查锁, 存在可见性问题
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}