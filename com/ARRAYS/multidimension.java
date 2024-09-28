package com.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        // int[][] arr2D={{1,2,3},
    //                 {2,4,9},
    //                 {19,8,7}};
    int[][] arr=new int[3][2];
    Scanner sc=new Scanner(System.in);
    for (int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
            
        }
    }
    //using enhanced for-loop
    for (int[] is : arr) {
        System.out.println(Arrays.toString(is));
    }
    }
}
