package com.ykk.override;

public class Animal {
    public void eat(){
        System.out.println("animal is eating");
    }
    public void eat(String food){
        System.out.println("animal is eating " + food);
    }
}
