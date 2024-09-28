package com;

public class hackerrank {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        //chevk for first occurences
        int start=search(nums,target,true);
        int end =search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    int search(int nums[],int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]> target){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                   end=mid-1; 
                } else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
