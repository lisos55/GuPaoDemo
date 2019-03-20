package com.gupao.simpleFactory;

import com.gupao.provincialCapital;

public class provincialCapitalFactory {

    public provincialCapital creat(Class<? extends provincialCapital> clazz){
        try {
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
