package com.ykk.block;

public class Test2 {
    //静态变量
    public  static  String name ="111"; //编译后会放到静态代码块里进行 name的赋值

    //成员变量(实例变量)
    public String mame2 ="222";  //编译后会放到构造器里 进行name2的赋值

    //静态方法
    public static void print(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println(Test2.name);
        Test2.print();
        new Test2();
    }
}
