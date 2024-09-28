package com.Searching2D;

import java.util.Arrays;

public class BinarySearch2d {
    public static void main(String[] args) {
        int[][] arr2={{10,20,30,40},
        {11,22,33,44},
        {15,25,35,45},
        {19,29,39,49}};
        System.out.println(Arrays.toString(matrices(arr2,35)));
    }
    static int[] matrices(int[][] arr2 ,int target){
        int r=0;
        int c=arr2.length-1;
        while(r<arr2.length && c>=0){
            if(arr2[r][c] == target){
                return new int[]{r,c};
            }
            else if(arr2[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
