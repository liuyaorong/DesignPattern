package com.liuyaorong.pattern.FactoryMethod.factory;

import com.liuyaorong.pattern.FactoryMethod.base.Operation;

/**
 * Created by liuyaorong on 2023/06/09
 * 工厂接口
 */
public interface IFactory {

    Operation CreateOption();
}