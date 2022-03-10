package com.ykk;

public class Father {
    public String name = "Lilei";

    public Father() {
        System.out.println("Father is created!");

    }

    public Father(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Father is working!");
    }
}
