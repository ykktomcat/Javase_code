package com.ykk.template;
/**
 * 明星罪犯
 */
public class StarPrisoner extends Prisoner {

    public  StarPrisoner(String name){
        this.name =name;

    }

    @Override
    void work() {
        System.out.println(this.name + "边唱歌，边劳动");

    }

    @Override
    void eat() {
        System.out.println(this.name + "边唱歌，边吃饭");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "边唱歌，边看新闻联播");
    }
}
