package com.ykk.override;

public class Test1 {
    public static void main(String[] args) {
        Party party = new Party();

        Human human = new Human();
        party.play(human);

        Human man = new Man();
        party.play(man);

        Human woman = new Woman();
        party.play(woman);

        /*
         以上结果都显示为  人类的狂欢
          **/

        Man man1 = new Man();
        party.play(man1);

        Woman woman1 = new Woman();
        party.play(woman1);

        /*
          虚拟机在选择重载方式时，是通过【静态类型】决定的而不是动态类型。
          由于静态类型编译时就可知，事实上虚拟在编译期就已经知道选择哪一个重载方法，并且把这个方法的符号引用写在了invoke virtual的指令中。
          **/

    }
}
