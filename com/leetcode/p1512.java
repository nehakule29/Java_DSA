package com.leetcode;

public class p1512 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        int res=0,n=1;
        if(nums.length<=1){
            System.out.println(nums);

        }
        else{
        for(int i=1;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                n=n+1;
            }
            else if(nums[i]>nums[i-1]){
                
                res=res+(n*(n-1)/2);
                n=1;
                
            }
            
        }
        res=res+(n*(n-1)/2);
        System.out.println(res);
        }
}
