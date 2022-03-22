package com.ykk.strategy;

/**
 * 比较年龄，继承最上层的比较方法
 */
public class AgeComparator implements Comparator{

    @Override
    public Integer compare(User user, User user1) {
        return user.getAge() - user1.getAge();
    }
}
