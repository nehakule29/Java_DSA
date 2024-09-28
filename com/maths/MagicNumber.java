package com.maths;

public class MagicNumber {
    public static void main(String[] args) {
        int n=5;
        int base=5;
        int res=0;
        for(int i=1;i<=n+2;i++){
            res+=(n&1)*base;
            base=base*5;
            n=n>>1;
        }
        System.out.println(res);
    }
}
