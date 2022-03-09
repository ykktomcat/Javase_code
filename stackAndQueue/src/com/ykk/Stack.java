package com.ykk;

import com.ykk.homework.SuperArray;

public class Stack {
    private  SuperArray superArray= new SuperArray();
    //栈的插入和删除操作只允许在表的尾端进行（在栈中成为“栈顶”），满足“FILO：First In Last Out”
    //压栈
    public void push(int data){
        superArray.addToTail(data);
    }

    //弹栈
    public int pop(){
        int data =superArray.select(superArray.size() -1);
        superArray.delete(superArray.size() - 1);
        return data;
    }
    //返回栈顶 不出栈
    public int  peek() {
        return superArray.select(superArray.size() -1);
    }

    public boolean isEmpty(){
        return superArray.size() == 0;
    }









}
