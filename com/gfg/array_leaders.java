package com.gfg;

import java.util.ArrayList;

public class array_leaders {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        ArrayList arr1=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                arr1.add(arr[i]);
            }
            else if(arr[i]>arr[i+1]){
                arr1.add(arr[i]);
            }
            
        }
        for (Object object : arr1) {
            System.out.println(object);
        }
    }
}
