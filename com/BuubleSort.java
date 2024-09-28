package com;

import java.util.Arrays;

public class BuubleSort {
    public static void main(String[] args) {
        int[] arr={3,5,6,2,1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    public static int[] bubble(int[] arr){
        int i=0;
        boolean b;
        
        while(i<arr.length){
            int j=1;
             b=false;
            while(j<=arr.length-i-1){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    b=true;
                }
                j++;
            }
            if(!b){
                break;
            }
            i++;
        }
        return arr;
    }
}
