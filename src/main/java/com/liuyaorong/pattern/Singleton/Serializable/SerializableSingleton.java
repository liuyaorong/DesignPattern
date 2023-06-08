package com.liuyaorong.pattern.Singleton.Serializable;

/**
 * Created by liuyaorong on 2023/6/8
 * 避免被序列化破坏, 属于双重检查的升级版
 */
public class SerializableSingleton {

    private volatile static SerializableSingleton singleton;

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if (singleton == null) {
            synchronized (SerializableSingleton.class) {
                if (singleton == null) {
                    singleton = new SerializableSingleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}