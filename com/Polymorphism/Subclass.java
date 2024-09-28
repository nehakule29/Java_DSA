package com.Polymorphism;

import com.access.A;

public class Subclass extends A {
    Subclass(int num,String s1){
        super(num,s1);
    }
    public static void main(String[] args) {
        Subclass a1=new Subclass(5, "ddnull");
        System.out.println(a1.getClass().getName());
    }
}
