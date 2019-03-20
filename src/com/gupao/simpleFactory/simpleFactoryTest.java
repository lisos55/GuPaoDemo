package com.gupao.simpleFactory;

import com.gupao.provincialCapital;
import com.gupao.wuHan;

public class simpleFactoryTest {

    public static void main(String[] args) {
        provincialCapitalFactory pcf = new provincialCapitalFactory();
        provincialCapital pc = pcf.creat(wuHan.class);
        pc.delicacy();
    }

}
