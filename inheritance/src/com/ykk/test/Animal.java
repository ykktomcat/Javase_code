package com.ykk.test;

/**
 * 引用传递和值传递
 * 每次的传递都是一次值的拷贝
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age =10;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //以下的animal传递的为引用
    public void eat(Animal animal){
        animal.setName("牛");
        System.out.println(this.name + "吃了" + animal.name);
    }
}
