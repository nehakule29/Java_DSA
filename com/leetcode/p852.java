package com.leetcode;

import com.OOP.staticExample;
    //Peak Index in a Mountain Array
public class p852 {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println(MountainPeak(arr));
    }
    static int MountainPeak(int[] arr){
        //arr={2,4,5,8,9,3,1}
        int start=0;
        int end=arr.length-1;
//int mid=start+(end-start)/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            


            }
            return 0;
        }
    }
