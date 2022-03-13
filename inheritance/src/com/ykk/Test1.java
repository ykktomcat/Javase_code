package com.ykk;

public class Test1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "ykk", 24);
        Teacher teacher2 = new Teacher(1, "ykk", 25);

        //重写equals方法
        System.out.println(teacher1.equals(teacher2));

        //重写toString方法
        System.out.println(teacher1);


        /*
         比较两个Integer用==还是equals
         超过+-128  用equals, 反之用==;
         建议都用equals;
         */
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));


    }
}
