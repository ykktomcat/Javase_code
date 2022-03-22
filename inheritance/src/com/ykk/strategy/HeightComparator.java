package com.ykk.strategy;
/**
 * 比较身高，继承最上层的比较方法
 */
public class HeightComparator implements Comparator{
    @Override
    public Integer compare(User user, User user1) {
        /**
         * 强转成int
         */
        return (int) (user.getHeight()   - user1.getHeight());
    }
}
