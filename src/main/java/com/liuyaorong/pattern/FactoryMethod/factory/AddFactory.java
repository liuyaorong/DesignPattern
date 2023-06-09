package com.liuyaorong.pattern.FactoryMethod.factory;

import com.liuyaorong.pattern.FactoryMethod.base.Operation;
import com.liuyaorong.pattern.FactoryMethod.base.OperationAdd;

/**
 * Created by liuyaorong on 2023/6/9
 */
public class AddFactory implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationAdd();
    }
}