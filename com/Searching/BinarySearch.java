package com.Searching;
 public class BinarySearch {
 
    static int indexi(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]> target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-10,-5,-2,0,1,2,34,45,67,89,1000};

        System.out.println(indexi(arr, 67));
    }
 }