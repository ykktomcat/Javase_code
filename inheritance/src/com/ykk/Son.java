package com.ykk;

public class Son extends Father {

    //无参构造器
    public Son() {
        System.out.println("Son is created!");
    }
    //public  String name ="Tom";


    //有参构造器调用父类
    public Son(String name) {
        //this.name = name;
        super(name);//不会向上检索，只会去上一级父类查找有参构造
    }


    public void eat(){
        System.out.println("Tom is eating!");
    }


    @Override  //重写父类方法
    public void work() {
        System.out.println("Son is working no father!");
    }
}
