package com.ykk.strategy;

public class User {

    private String username;
    private Integer age;
    private Double height;

    public User() {
    }

    /**
     * 全参构造后  记得新增一个无参构造
     */
    public User(String username, Integer age, Double height) {
        this.username = username;
        this.age = age;
        this.height = height;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     *
     * 重写toString
     */
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
