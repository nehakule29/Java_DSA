package com.leetcode;

public class p1095 {
    public static void main(String[] args) {
        int[] arr={1,5,2};
        System.out.println(search(arr,2));
    }

    static int search(int[] arr,int target){
        int peak=MountainPeak(arr);
        int firstTry=indexi(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return indexi(arr, target,peak,arr.length-1 );
    }
    static int indexi(int[] arr,int target,int start,int peak){
        
       // int start=0;
        int end=peak;
        boolean isAsc=arr[start]<arr[end];
      //  int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]> target){
                end=mid-1;
            }
        }else{
            if(arr[mid]<target){
                end=mid-1;
                
            }
            else if(arr[mid]> target){
                start=mid+1;
            }
        }
        }
        return -1;
    }
    static int MountainPeak(int[] arr){
        //arr={2,4,5,8,9,3,1}
        int start=0;
        int end=arr.length-1;
//int mid=start+(end-start)/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                int peak=mid;
                return peak;
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
