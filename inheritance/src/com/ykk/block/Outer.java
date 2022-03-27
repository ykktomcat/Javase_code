package com.ykk.block;


/**
 * 外部类中 定义 内部类
 */
public class Outer {
    public Outer() {
        System.out.println("outer");
    }


    //内部类  只能在实例对象内部使用

    /**
     * public  class Inner
     * new Outer().new Inner();
     * <p>
     * public static class Inner  静态内部类
     * new Outer.Inner();
     *
     * 编译后Outer 和 Inner 是两个独立的class
     *
     * 超级链表里的Node可以定义成内部类
     */
    public static class Inner {

        public Inner() {
            System.out.println("inner");

        }

    }


    public void test() {
        new Inner();
    }


    public static void main(String[] args) {
        new Outer().test();
        new Outer.Inner();
    }
}
