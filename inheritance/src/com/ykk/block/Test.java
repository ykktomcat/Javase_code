package com.ykk.block;

public class Test {
    /**
     * 每次创建实例，都会被调用 一次，其实用的很少（一般都想直接写在构造器里）
     * 会放到构造器里执行，先于构造器的代码 执行
     */
    {
        System.out.println("实例代码块");
    }

    /**
     * 一个类被加载时会被调用一次，常用在需要做一些全局初始化的工作。
     */
    static {
        System.out.println("静态代码块");
    }

    public Test() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
    }
}
