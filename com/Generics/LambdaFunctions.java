package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctions {
    public static void main(String[] args) {

        Addable add=(a,b) ->(a+b); //lambda expressions without return keyword
        Addable say=(int a,int b) -> {
            return a+b;
        }; //lambda expressions with return keyword
        
        List<String> list=new ArrayList<>();
        list.add("rahul");
        list.add("jay");
        list.add("mayank");

        list.forEach((n)->System.out.println(n));


    }
}

/**
 * InnerLambdaFunctions
 */ 

