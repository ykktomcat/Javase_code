package com.ykk;

import java.util.Scanner;

public class BankTicket {
    //银行排队取票
    Queue  queue = new Queue();
    private int curridenx =0;

    private void addTicket(String name){
            queue.add(curridenx);
            curridenx++;
            System.out.println(name + "，您取到的号码为 " + curridenx + " 。");

    }

    public void run(){
        while (true){
            Scanner scanner =new Scanner(System.in);
            System.out.println("请输入您的名字：");
            String name =scanner.next();
            addTicket(name);
        }

    }
}
