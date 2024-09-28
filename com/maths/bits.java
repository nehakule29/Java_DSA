package com.maths;

/**
 * bits
 */
public class bits {

    
    public static boolean  checkeven(int num){
        return (num&1)==0;

    }

    public static int fun(int n,int k){
        int m=n|(1<<(k));
        return m;
    }
      

    public static void main(String[] args) {
        int num=33;
        System.out.println(fun(10,2));
    }
}