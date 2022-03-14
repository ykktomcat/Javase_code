/**
 * 多态的简单例子
 * 多态存在的宏观条件
 * 1、存在继承
 * 2、存在方法的重写
 * 3、有父类引用指向子类对象
 * **/

package com.ykk;

public class Test3 {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        girl.feed(animal);
        girl.feed(dog);
        girl.feed(cat);
    }
}
