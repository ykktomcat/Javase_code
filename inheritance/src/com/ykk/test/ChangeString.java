package com.ykk.test;

/**
 * important;
 */
public class ChangeString {
    public static void changeString(String str){
        str = "hello";

    }

    public static void main(String[] args) {
        String str = "你好";
        changeString(str);

        System.out.println(str);
    }
}
