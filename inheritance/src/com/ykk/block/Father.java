package com.ykk.block;

public class Father {
    public Father() {
        System.out.println("父类的构造器");
    }

    static {
        System.out.println("父类的静态代码");
    }

    {
        System.out.println("父类的实例代码");
    }
}
