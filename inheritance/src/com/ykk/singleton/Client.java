package com.ykk.singleton;

public class Client {
    public static void main(String[] args) {
//        Singleton s1=  Singleton.getINSTANCE();
//        Singleton s2=  Singleton.getINSTANCE();
//        Singleton s3=  Singleton.getINSTANCE();
//
//
//        System.out.println(s1 == s2);
//        System.out.println(s3 == s2);


        Singleton3 s1=  Singleton3.getINSTANCE();
        Singleton3 s2=  Singleton3.getINSTANCE();
        Singleton3 s3=  Singleton3.getINSTANCE();


        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
    }
}
