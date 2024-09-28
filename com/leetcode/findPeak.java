package com.leetcode;
    
public class findPeak {
    static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] && (mid>=1) |mid<nums.length-2 ){
               return mid;
           }
           
           if(nums[mid]<=nums[mid+1]){
               start=mid+1;
           }
        //    else{
        //        end=mid-1;
        //    }
           
           if(mid==nums.length-1){

           
              start=0;
              end=nums.length-1;
              mid=start+(end-start)/2;
              end=mid-1;
           }


        }
        return end+1;
   }
   public static void main(String[] args) {
    int[] nums={1,2,3,1};
    System.out.println(findPeakElement(nums));
   }
}
