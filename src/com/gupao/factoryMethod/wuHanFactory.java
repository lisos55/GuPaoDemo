package com.gupao.factoryMethod;

import com.gupao.provincialCapital;
import com.gupao.wuHan;

public class wuHanFactory implements provincialCapitalFactory {

    @Override
    public provincialCapital create() {
        return new wuHan();
    }
}
