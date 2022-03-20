package com.ykk.abstractAndInterface;

/**
 * 继承自一个抽象类，必须实现抽象类里定义的抽象方法，否则自己需要声明成一个抽象类
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }
}
