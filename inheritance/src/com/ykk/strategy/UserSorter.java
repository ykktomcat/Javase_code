package com.ykk.strategy;

/**
 * 冒泡比较器
 */

public class UserSorter {
    /**
     * 传入比较的接口  Comparator 抽象出来只是代表一种能力
     */
    public void sort(User[] user, Comparator comparator) {
        for (int i = 0; i < user.length - 1; i++) {
            for (int j = 0; j < user.length - i - 1; j++) {
                if (comparator.compare(user[j], user[j + 1]) > 0) {
                    User temp = user[j];
                    user[j] = user[j + 1];
                    user[j + 1] = temp;
                }
            }

        }

    }
}
