package com.liuyaorong.pattern.Singleton.lazy;

/**
 * Created by liuyaorong on 2023/6/8
 * 懒汉模式 - 静态内部类
 */
public class StaticInnerClassLazySingleton {

    //静态内部类中初始化实例对象, 实现延迟初始化
    private static class SingletonHolder {
        private static final StaticInnerClassLazySingleton INSTANCE = new StaticInnerClassLazySingleton();
    }

    private StaticInnerClassLazySingleton() {

    }

    public static StaticInnerClassLazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}