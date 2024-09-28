package com.ExceptionHandling;

public class MyExcepMain {
    public static void main(String[] args) {
        try{
            String name="kunal";
            if(name.equals("kunal")){
                throw new MyException("name is kunal");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
