package com.gfg;

public class chocolate {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int mrp=10;
        int bal=0;
        int bought=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                bought=arr[i];
                continue;
            }
            int m=arr[i-1]-arr[i];
            if(m>0){
                bal=bal+m;
                continue;
            }
            m=arr[i]-arr[i-1];
            if( bal<m){
                
                bought=bought+m-bal;
                bal=0;
            }
            else if (bal>m){
                bal=bal-m;
            }
            
        }
        System.out.println(bought*mrp);
        
    }
}
