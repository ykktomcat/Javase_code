package com.ykk.block;

public class Son extends Father{
    public Son() {
        System.out.println("子类的构造器");
    }

    static {
        System.out.println("子类的静态代码");
    }

    {
        System.out.println("子类的实例代码");
    }

    public static void main(String[] args) {
        new  Son();
    }
}

    /**
     * 顺序
     * 父类的静态代码   ---- 加载到内存时调用、先执行父类
     * 子类的静态代码   ---- 加载到内存时调用、其次执行子类
     * 父类的实例代码   ---- 执行new  先执行父类
     * 父类的构造器     ---- 执行new  先执行父类  ---实例代码优先于构造器里的代码
     * 子类的实例代码    ---- 执行new  其次执行子类
     * 子类的构造器     ---- 执行new  其次执行子类  ---实例代码优先于构造器里的代码
     */

