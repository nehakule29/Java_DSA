package com.access;

public class A {
 int num;
    public int getNum() {
        return num;
    }
    private String name;
    int[] arr;
    public A(int num,String name){
        this.num= num;
        this.name=name;
        this.arr= new int[num];

    }

}
