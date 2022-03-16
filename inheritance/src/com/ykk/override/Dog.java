package com.ykk.override;

public class Dog extends  Animal {
    public String name ="dog";
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void eat(String food) {
        System.out.println("dog is eating " + food);
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat("meat");
        System.out.println(animal.name);
    }
    /**
     * 这个案例里边有重载，也有重写，最终会选择Dog类的(String food)方法，
     *
     * 第一步是静态分派的过程，jvm从Animal类的多个重载方法中选择了 Animal::eat(String food) 这个方法，并且生成指令 invoke virtual Animal::eat(String food)。
     *
     * 第二步是动态分派的过程，是根据运行时类型确定具体调用谁的 eat(String food) 方法，因为运行时类型是Dog，所以最终的方法选择是 Dog::eat(String food) 。
     *
     * 这两个过程是相辅相成，不是有你没我的关系。
     *
     * 重载(overloading)和重写(overriding)是java多态性的体现，但是由于重载是静态分派的原因，有些博客不认为重载也能体现多态性，这个就见仁见智了。
     *
     * ***多态只和方法有关和属性无关***
     */
}
