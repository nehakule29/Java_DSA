package com.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[5];
    }
   // Cloning--Shallow Copy
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();

    // }
    
    // Deep Copying
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin=(Human)super.clone();
        twin.arr= new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
        

    }

}
