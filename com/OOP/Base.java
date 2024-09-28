package com.OOP;

public class Base {
     double l;
    double h;
     double w;
    Base(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Base(double side){
        this.l=side;
        this.h=side;
        this.w=side;

    }

    Base(Base old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
