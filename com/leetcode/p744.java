package com.leetcode;

public class p744 {
    static char charceil(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start%arr.length]; 
    
    }
    public static void main(String[] args) {
        char[] arr={'a','c','f','h','i','k','m'};
        char target='h';
        System.out.println(charceil(arr,target));
    }
}
