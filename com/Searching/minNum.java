package com.Searching;

import java.lang.reflect.Array;

public class minNum {
    static int min(int[] nums){
       int min=0;
       for (int i : nums) {
        if(i<min){
            min=i;
        }
       } 
       return min;
    }
    public static void main(String[] args) {
        int[] nums={18,12,-7,3,14,25};
        
        //System.out.println(min(nums));

        int[][] arr={{2,3,2},{5,6,70},{9,7,15}};

    //Searching in 2D Array    
        for (int row=0;row<arr.length;row++) {
            for (int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==15){
                    System.out.println(row+" "+col);
                }
            }
        }

    
    }
}
