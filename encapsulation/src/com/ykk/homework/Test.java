package com.ykk.homework;

public class Test {
    public static void main(String[] args) {
        String str = "Hello world abc Hello";
        Test test = new Test();
        int Count = test.wordCount(str, "Hello");
        System.out.println(Count);
    }



    public int wordCount(String article, String word) {
        //1、先把文章打散成数组
        String[] words = article.split(" ");
        int res = 0;
        for (String s : words) {
            if (s.equals(word)) {
                res++;
            }
        }
        return res;
    }
}
