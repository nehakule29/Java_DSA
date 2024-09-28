package com.ExceptionHandling;
public class Main {
public static void main(String[] args) {
    

    int a=5;
    int b=0;
    try{
        int w=2/0;

    }catch(Exception e) {
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        //System.out.println(e.getMessage());
    }finally{
        System.out.println("Always execute");
    }

    try {
        int c=7/0;

    } 
    catch(ArithmeticException e){
        System.out.println("This is an Arithmetic Exception");
    }catch (Exception e) {
        System.out.println(e.getMessage());
        // TODO: handle exception
    }
}
}