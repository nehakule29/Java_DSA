package com.gfg;

import java.util.ArrayList;

public class k_subarray {
    public static void main(String[] args) {
    int[] arr={1,2,3,1,4,5,2,3,6};
    ArrayList res=new ArrayList();
    int k=3;
    int max=0;
    for(int i=k-1;i<arr.length;i++){
        for(int j=i;j>=(k-i-1);j--){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        res.add(max);

    }
    }
    

    

}
