package com.gupao.AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        LcSchoolFactory lc = new LcSchoolFactory();
        lc.sayName().say();
        lc.talkName().say();
    }
}
