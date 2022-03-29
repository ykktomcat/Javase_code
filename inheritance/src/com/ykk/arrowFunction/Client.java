package com.ykk.arrowFunction;

public class Client {
    public static void main(String[] args) {
//        //匿名内部类
//        Functoin functoin = new Functoin() {
//            @Override
//            public int plus(int i, int j) {
//                return i + j;
//            }
//        };
//        System.out.println("functoin.plus(1,2) = " + functoin.plus(1, 2));

        //函数式接口的表达方式，本质是匿名内部类，可看出一种语法糖
        Functoin functoin =((i, j) -> i + 2*j);
        System.out.println("functoin.plus(1,2) = " + functoin.plus(1, 2));
    }
}
