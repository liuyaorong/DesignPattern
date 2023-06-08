package com.liuyaorong.pattern.Singleton.hangry;

/**
 * Created by liuyaorong on 2023/6/8
 * 饿汉模式 - 变种
 */
public class HangrySingletonPlus {

    private static HangrySingletonPlus singleton;

    static {
        // 静态代码块中实例化该实例
        singleton = new HangrySingletonPlus();
    }

    private HangrySingletonPlus() {

    }
    public static HangrySingletonPlus getInstance() {
        return singleton;
    }
}