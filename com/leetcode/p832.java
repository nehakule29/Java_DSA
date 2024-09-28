package com.leetcode;
//Flipping an image
public class p832 {
    static void printm(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }
        }
    
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n/2;j++){
                int temp=arr[i][j];
                arr[i][j]=((arr[i][n-j])^1);
                arr[i][n-j]=((temp)^1);
            }
            if(n%2==0){
                arr[i][n/2]^=1;
            }
        
        
        
    }
    printm(arr);

    
    }
}
