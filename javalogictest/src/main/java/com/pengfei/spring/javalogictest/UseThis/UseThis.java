package com.pengfei.spring.javalogictest.UseThis;

/**
 * Created by zhaopengfei on 2017/1/1.
 */
//不要随意使用this，只为了取得直观性而使用this是不合适的；
//    1.构造器中调用另一构造器可以使用this(...)
//        Attention：call to this(...) must be the first statement in the constructor,
//                   and any method must not call this(..)!
//    2.在局部变量和成员变量同名时，使用this来引用成员变量。
public class UseThis {
    private  int age;

    private  UseThis(int age){
        this.age = age;
        System.out.println("constructor with int only");
    }

    private UseThis(String message){
        System.out.println("constructor with String only");
    }

    private UseThis(int age,String message){
        this(15);
        System.out.println("constructor with int & String");
    }

    private UseThis(){
        this(15,"hello");
        System.out.println("constructor without any parameter");
    }

    public static void main(String[] args) {
        new UseThis();
    }
}
