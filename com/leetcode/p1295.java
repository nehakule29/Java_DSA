package com.leetcode;

public class p1295 {
    public static void main(String[] args) {
        int[] nums={133,552,444};
        int c=0;
        for(int i=0;i<nums.length;i++){
            int h=0;
            while(nums[i]>0){
                h=h+1;
               nums[i]=nums[i]/10; 
            }
            if(h%2==0){
                c+=1;
            }
           
        }
        System.out.println(c);

        
    }
}
