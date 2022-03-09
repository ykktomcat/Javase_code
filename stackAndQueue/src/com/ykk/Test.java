package com.ykk;

public class Test {
    public static void main(String[] args) {
//        Stack stack  = new Stack();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue queue = new Queue();

        queue.add(9);
        queue.add(4);
        queue.add(5);
        queue.add(7);
        queue.add(1);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }

}
