package com.Polymorphism;

import com.access.A;

public class Circle extends Shapes {
    
    void area(){
        System.out.println("The area is pi*r*r");
    }

    public static void main(String[] args) {
        A a3=new A(5,"neha");
        System.err.println(a3.getNum());

    }
     
}
