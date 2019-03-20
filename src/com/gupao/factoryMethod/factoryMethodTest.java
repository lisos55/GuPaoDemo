package com.gupao.factoryMethod;

public class factoryMethodTest {
    public static void main(String[] args) {
        provincialCapitalFactory pdf = new wuHanFactory();
        pdf.create().delicacy();

        provincialCapitalFactory pdf2 = new changShaFactory();
        pdf2.create().delicacy();
    }
}
