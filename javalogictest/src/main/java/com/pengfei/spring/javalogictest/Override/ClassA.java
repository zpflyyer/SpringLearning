package com.pengfei.spring.javalogictest.Override;

/**
 * Created by zhaopengfei on 2017/1/1.
 */
public class ClassA {
    private void introSelf(String name, int age){
        System.out.println(name + age);
    }

    private String introSelf(int age,String name){
        System.out.println(age + name);
        return age + name;
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.introSelf(15,"Json");
        classA.introSelf("json",15);
    }
}
