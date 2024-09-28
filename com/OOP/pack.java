package com.OOP;
class Human{
    String name;
    int age;
    static int population;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
        Human.population+=1;
    }

   public void country(){
        System.out.println("I am Indian");
   }
}
   class Employee{
    public Employee(){
        System.out.println("Employee");
    }
   }

public class pack {
    public void A(int a){
        int id=a;
    }
    public static void main(String[] args) {
        Human h1=new Human("Neha", 22);
        Human h2=new Human("Nidhi",18);
        System.err.println(h1.population);
        System.out.println(h2.population);

        pack n1=new pack();  //Need to create a object of class to access a non-static method.
        n1.A(8);

    }
}
