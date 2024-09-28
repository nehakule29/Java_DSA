package com.Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int target=5;
        System.out.println(findingRange(arr, target));
    }
    static int findingRange(int[] arr,int target){
        //first finding range
        int start=0;
        int end=1;

        //condition for target to lie in range
        while(target>arr[end]){
            int newStart=end+1;
            end=end+ 2*(end+1-start);
            start=newStart;

        }
        return binarySearch(arr, target, start, end);

        }
    static int binarySearch(int[] arr,int target,int start, int end){
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
    return 0;
}
}
