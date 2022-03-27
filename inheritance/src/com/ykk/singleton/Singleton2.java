package com.ykk.singleton;

/**
 * 懒汉设计模式
 */
public class Singleton2 {
    private  static  Singleton2 singleton;

    private Singleton2(){

    }

    public static Singleton2 getSingleton() {
        return singleton;
    }

    public void setSingleton2 () {
        if(null  == singleton){

            singleton = new Singleton2();
        }
    }
}

