package com.ykk.singleton;

/**
 * 静态内部类 实现单例
 */
public class Singleton3 {
    //静态内部类 实现单例
    private Singleton3(){

    }
    //静态内部类
    public  static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }


    public static Singleton3  getINSTANCE(){
        return SingletonHolder.INSTANCE;

    }

}
