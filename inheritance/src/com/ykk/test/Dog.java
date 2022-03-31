package com.ykk.test;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void  changeDog(Dog dog){
        dog = new Dog("修勾");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小狗");
        changeDog(dog);
        System.out.println(dog.name);
        System.out.println(dog.getName());
        System.out.println(dog.toString());
    }
}
