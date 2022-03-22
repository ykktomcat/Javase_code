package com.ykk.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("李四",14,170.1);
        User user2 = new User("王二",21,160.1);
        User user3 = new User("赵六",32,172.1);
        User user4 = new User("张三",18,178.1);

        User[] users = {user1,user2,user3,user4};
        UserSorter userSorter = new UserSorter();
        userSorter.sort(users,new HeightComparator());
        System.out.println(Arrays.toString(users));
    }

}
