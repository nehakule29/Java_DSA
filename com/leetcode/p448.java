package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p448 {
    public static void main(String[] args) {
        int[] nums ={1,1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();

        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(i=1;i<=nums.length;i++){
                //li.add(i+1);
                if(nums[i-1]!=i){
                    li.add(nums[i-1]);
                    li.add(i);
                }
            }
            return li;
        }
        
    }

