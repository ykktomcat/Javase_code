package com.ykk.template;

public class FuckPrisoner extends  Prisoner{

    public FuckPrisoner(String name) {
        this.name =name;
    }

    @Override
    void work() {
        System.out.println(this.name + "无心工作");
    }

    @Override
    void eat() {
        System.out.println(this.name + "不想吃饭");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "不看新闻联播");
    }
}
