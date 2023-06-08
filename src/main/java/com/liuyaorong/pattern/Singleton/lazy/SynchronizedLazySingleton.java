package com.liuyaorong.pattern.Singleton.lazy;

/**
 * Created by liuyaorong on 2023/6/8
 * 懒汉模式 - 同步锁(线程安全)
 */
public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton singleton;

    private SynchronizedLazySingleton() {

    }

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedLazySingleton();
        }
        return singleton;
    }
}
