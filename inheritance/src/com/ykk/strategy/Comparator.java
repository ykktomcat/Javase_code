package com.ykk.strategy;

/**
 * 在最上层定义一个比较的接口 返回一个Integer
 * 可以 implements 此接口 获得这个接口的能力
 */
public  interface   Comparator {
    Integer compare(User user, User other);

}
