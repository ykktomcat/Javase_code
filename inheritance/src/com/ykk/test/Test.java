package com.ykk.test;


public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("狼");
        Animal animal1 =new Animal();
        animal1.setName("羊");
        int age =5;
        animal1.setAge(age); //此处age拷贝了一个age=5传了个5进去
        animal.eat(animal1);
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());
        System.out.println(age);
    }
}
