package com.OOP;

public class singleton {
    private static singleton instance;
    public static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        singleton obj1=singleton.getInstance();
        singleton obj2=singleton.getInstance();
    }
    }
    
