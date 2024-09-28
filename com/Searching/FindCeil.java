package com.Searching;

public class FindCeil {
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target==arr[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]> target){
                end=mid-1;
            }
            else{
                return arr[mid]; 
               
            }
        }
            return arr[end];

    }
    static int ceil(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target==arr[end]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]> target){
                end=mid-1;
            }
            else{
                return arr[mid]; 
               
            }
        }
            return arr[start];
        }
    
    public static void main(String[] args) {
        int[] arr={2,3,4,6,9,14,16,18};
        
        int target=18;
        System.out.println("Ceil of target "+ceil( arr,target));
        System.out.println("Floor of target "+floor(arr,target));
    }
    }

