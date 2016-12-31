package com.pengfei.spring.javalogictest.lomboktest;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by zhaopen on 12/30/2016.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class HeroUnit extends GeneralUnit {
    private   String name;
    public HeroUnit(String name) {
        this.name = name;
    }
}
