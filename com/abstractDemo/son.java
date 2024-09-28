package com.abstractDemo;

public class son extends Parent{

    public son(int age){
        super(age);
    }
    @Override
    void career(String s1){
        System.out.println(s1);
    }

    @Override
    void partner(String s2,int n){
        System.out.println(n);
    }
}
