package com.liuyaorong.pattern.Singleton.hangry;

/**
 * Created by liuyaorong on 2023/6/8
 * 饿汉模式 - 基础版
 */
public class HangrySingleton {

    private static HangrySingleton singleton = new HangrySingleton();

    private HangrySingleton() {

    }

    public static HangrySingleton getInstance() {
        return singleton;
    }
}