package com.ykk.abstractAndInterface;

/**
 * 1、必须实现接口里的所有方法
 * 2、可继承多个不同的接口，实现不同的能力，但是只能继承一个类
 * 3、接口直接也可以相互继承
 * 4、同时继承一个类 + 实现一个接口 public class Cat extends Animal  implements Pet
 */
public class Cat extends Animal  implements Pet,A {

    //实现Pet里的eat play run
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void run() {

    }


    //实现A里的test
    @Override
    public void test() {

    }
}
