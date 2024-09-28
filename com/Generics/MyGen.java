package com.Generics;

public class MyGen<T> {
    T obj;
    void add(T obj){
        this.obj=obj;

    }

    public static<E> void printArray(E[] elements){
        for (E element : elements) {
            System.out.println(element);
            
        }
    }

    T get(){
        return obj;
    }
    
}
