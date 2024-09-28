package com.abstractDemo;

public abstract class Parent {
    int age;
    abstract void partner(String s2,int name);
    abstract void career(String s1);

    public Parent(int age){
        this.age=age;

    }
    static void hello(){
        System.out.println("hello");
    }

    void greetings(){
        System.out.println("greetings");
    }
}
