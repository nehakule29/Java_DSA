package com.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal=new Human(33,"neha");
        // Human twin=new Human(kunal); 

        
            Human twin=(Human)kunal.clone();
            
        System.out.println("Clone object before change in original"+Arrays.toString(twin.arr));
        kunal.arr[1]=3;
        System.out.println("Clone object after change in original"+Arrays.toString(twin.arr));

    }
}
