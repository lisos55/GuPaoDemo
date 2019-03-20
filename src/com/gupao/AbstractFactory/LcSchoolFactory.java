package com.gupao.AbstractFactory;

public class LcSchoolFactory implements schoolFactory {
    @Override
    public middleSchool sayName() {
        return new tianJingMiddleSchool();
    }

    @Override
    public primarySchool talkName() {
        return new tianJingPrimanySchool();
    }
}
