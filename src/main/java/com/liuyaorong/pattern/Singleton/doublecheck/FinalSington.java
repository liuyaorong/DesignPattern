package com.liuyaorong.pattern.Singleton.doublecheck;

/**
 * Created by liuyaorong on 2023/6/8
 */
public class FinalSington {

    private FinalWrapper<FinalSington> helperWrapper = null;

    public FinalSington getInstance() {
        FinalWrapper<FinalSington> wrapper = helperWrapper;
        if (wrapper == null) {
            synchronized (this) {
                if (helperWrapper == null) {
                    helperWrapper = new FinalWrapper<>(new FinalSington());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }
}

class FinalWrapper<T> {
    public final T value;

    public FinalWrapper(T value) {
        this.value = value;
    }
}