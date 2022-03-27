package com.ykk.singleton;

/**
 * 饿汉模式
 */
public class Singleton {
//    //初始化一个static final修饰的 INSTANCE
//    private static final Singleton INSTANCE = new Singleton();

    //初始化一个static final修饰的 INSTANCE
    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }


    //私有化构造器 保证别人不能 new
    private  Singleton (){

    }

    //返回一个  保证别人不能能取到 Singleton
    public static Singleton getINSTANCE() {
        return INSTANCE;
    }
}
