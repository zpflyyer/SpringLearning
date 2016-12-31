package com.pengfei.spring.javalogictest.lomboktest;

import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * Created by zhaopen on 12/30/2016.
 */
//由于@Data默认当前子类从父类继承而来的其他属性，toString()和hashCode(）方法也只会依据当前对象中作为对父类的扩展而定义的非静态的，非瞬态的属性来进行计算；
//    这将导致两个子类对象，在仅有从父类继承过来的属性的不同以及他们作为对父类的扩展而定义的属性完全一致的请况下，将会导致一些trickery的事情：这样的两个对象是equal的！？
//    所以，对于继承了父类的子类而言，可以采取两种途径：①添加@EqualsAndHashCode(callSuper = true);②自己实现toString()方法；
//    最好避免对子类使用@Data
@Log
public class Test {
    public static void main(String[] args) {
        MonsterUnit u1 = new MonsterUnit("半人马");
        u1.setNation("近卫");
        MonsterUnit u2 = new MonsterUnit("半人马");
        u2.setNation("中立");
        log.log(Level.INFO,String.valueOf(u1.equals(u2)));
        log.log(Level.INFO,u1.toString());
        log.log(Level.INFO,u2.toString());
    }
}
