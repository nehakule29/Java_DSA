package com.Polymorphism;
    
public class main {
    double sum( double a,  double b){
        return a+b;
    }
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes sq=new Square();
        Shapes c1=new Circle();

        c1.area();

        
    }
}
