package com.ykk;

import com.ykk.homework.SuperArray;

public class Queue {
    private SuperArray superArray = new SuperArray();

    //队列只允许在表尾插入数据元素，在表头删除数据元素,满足“First In First Out”。
    //添加
    public void add(int data) {
        superArray.addToTail(data);
    }

    //取出
    public int poll() {
        int data = superArray.select(0);
        superArray.delete(0);
        return data;
    }

    //返回
    public int peek() {
        return superArray.select(0);
    }

    public boolean isEmpty() {
        return superArray.size() == 0;

    }

}
