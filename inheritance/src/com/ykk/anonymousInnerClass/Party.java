package com.ykk.anonymousInnerClass;

public class Party {
    public void play(Human human){
        human.play();
        System.out.println("人类的狂欢");
        System.out.println("------------");
    }

    public static class Hermaphrodite implements Human {

        @Override
        public void play() {
            System.out.println("人妖的狂欢-内部静态类方式实现");
        }
    }


    public static void main(String[] args) {
        Party party = new Party();
//        Man man  = new Man();
//        party.play(man);

        //普通方式实现
        Hermaphrodite hermaphrodite = new Hermaphrodite();
        party.play(hermaphrodite);

        //匿名内部类方式实现 --代码更加简洁，可以不用单独新增 实现接口的具体类文件
        party.play(new Human() {
            @Override
            public void play() {
                System.out.println("人妖的狂欢-匿名内部类实现");
            }
        });


        party.play(new Hermaphrodite());






    }


}
