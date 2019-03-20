package com.gupao.factoryMethod;

import com.gupao.changSha;
import com.gupao.provincialCapital;

public class changShaFactory implements provincialCapitalFactory {
    @Override
    public provincialCapital create() {
        return new changSha();
    }
}
