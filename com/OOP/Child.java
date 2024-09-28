package com.OOP;

public class Child extends Base {
    double weight=9.0;
    public Child(){
        this.weight=-1;
    }
    public Child(double l){
        super(l);
        this.weight=weight;

    }

    public static void main(String[] args) {
        Child c1=new Child(2);
        System.out.println(c1.l+ " "+ c1.h + " "+ c1.w);
    }
}
