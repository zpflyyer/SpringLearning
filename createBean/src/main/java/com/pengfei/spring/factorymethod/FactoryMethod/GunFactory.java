package com.pengfei.spring.factorymethod.FactoryMethod;

/**
 * Created by zhaopen on 1/3/2017.
 */
public class GunFactory {
    protected Gun getGun(KindEnum kindEnum){
        if(kindEnum.equals(KindEnum.BLACK)){
            return new Gun("shotGun");
        }
        else
            return new Gun("other_gun");
    }
}
