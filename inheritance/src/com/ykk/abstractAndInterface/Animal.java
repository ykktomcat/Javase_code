package com.ykk.abstractAndInterface;

/**
 * 2022.03.20
 * 抽象类的概述 abstract
 * 抽象类是普通类更高级的抽象
 * 1、有抽象方法的类，必须声明为抽象类
 * 2、抽象类无法被直接构造， 是一种约定，方法由子类来负责具体实现
 * 3、可存在构造器，自己不能构造，由子类实现
 * 4、可以定义成员变量在抽象类里
 */
public abstract class Animal {

    protected   String name = "tom";
    public Animal() {
        System.out.println("animal is created！");
    }

    //一个抽象方法
    public abstract void eat();

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}
