package com.ykk;

/**
 * 对象的转型
 */

public class Girl {

    public void  feed(Animal animal){
        animal.coquetry();
        //向下转型，关键语法(目标对象)待转对象
        //Dog dog = (Dog)animal;
        //dog.coquetry();
        //dog.run();
        // 向下转型，能获取dog独有的方法
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.run();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.run();
            cat.coquetry();
        }
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        // 向上转型，自动回丢失Dog的特性
        girl.feed(new Cat());
    }
}
