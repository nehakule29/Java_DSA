package com.ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //datatype[] variable_name=new datatype[];
        int[] rollno=new int[5];
        //or 
        int[] rollno2={22,33,22,44,1};

        //array of objects
        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
       
        //modify
        str[1]="neha";
        System.out.println(Arrays.toString(str));
    }
}
