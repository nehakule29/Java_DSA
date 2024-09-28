package com.ARRAYS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);
        int[] n=new int[2];
        List<Integer> li=new ArrayList<>();
      
        list.add(333);
        list.add(774);
        list.add(90);
        list.add(2,6);
        list.add(1000);
        System.out.println("Size of list"+list.size());
        System.out.println(list.toString());
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(list);
        System.out.println("Size of nums"+nums.size());
        System.out.println(nums.toString());
        nums.trimToSize();
        System.out.println("nums after trimsize"+nums.toString());
        ListIterator in=nums.listIterator(1);
        System.out.println(in.next());
        System.out.println(in.next());
        System.out.println(in.next());
        // System.out.println(list);
        // list.set(0,3);
        // list.remove(1);
        // System.out.println(list);
        
        
        /*
        //input
             for(int i=0;i<5;i++) {
                list.add(sc.nextInt());
            }
         
            

        // get item at any index
            for(int i=0;i<5;i++){
                System.out.println(list.get(i)); //list[index] will not work here
            }
        */
    }
}
