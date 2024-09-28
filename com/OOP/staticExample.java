package com.OOP;

public class staticExample {
    static int a=4;
    static int b;

    static{
        System.out.println("I am as static block example"); //will only run once when class is loaded first time
        b=a*5;
    }

    public static void main(String[] args) {
        staticExample obj=new staticExample();
        System.out.println(staticExample.a+ ' '+ staticExample.b);
        
    }
} 
