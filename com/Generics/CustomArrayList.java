package com.Generics;

import java.util.Arrays;
import java.util.List;

public class CustomArrayList<T>{
    private Object[] data;
    private static int DEFAULTSIZE=10;

    private int size=0;
    
    public CustomArrayList(){
        data=new Object[DEFAULTSIZE];

    }

    public void add(T obj){
        if(isFull()){
            resize();
        }
        data[size++]=obj;
    }

    private void resize(){
        Object[] temp=new Object[data.length*2];

    
    for(int i=0;i<data.length ; i++){
        temp[i]=data[i];
    }

    }
    public boolean isFull(){
        return size == data.length;
    }
    @Override
    public String toString(){
        return "CustomArrayList{"+ "data=" + Arrays.toString(data)+", size"+size+ " }";
    }
}

