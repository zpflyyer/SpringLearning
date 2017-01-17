package com.pengfei.spring.ceateBean.FactoryMethod;

/**
 * Created by zhaopen on 1/3/2017.
 */
public class GunFactory {
    protected Gun getGun(HumanKind kindEnum){
        if(kindEnum.equals(HumanKind.BLACK)){
            return new Gun("shotGun");
        }
        else
            return new Gun("other_gun");
    }
}
