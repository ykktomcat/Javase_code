package com.ykk.template;

/**
 * 体验者
 */
public class Visitor {

    public void visit(Prisoner prisoner){
        System.out.println("--------体验罪犯的一天--------------");
        prisoner.life();
        System.out.println("--------体验罪犯的一天结束--------------");
    }


    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Prisoner prisoner  = new StarPrisoner("吴亦凡");
        Prisoner prisoner1  = new FuckPrisoner("罪犯张三");
        visitor.visit(prisoner1);
    }
}
