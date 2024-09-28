package com.Searching;

public class LinearSearch {
    static int search2(String str,char ch){
        if(str.length()==0){
            return -1;
        }
        for (char c: str.toCharArray()) {
            if(c==ch){
                return 111;
            }
        }
        return -1;
    }
    static int search(String str,char ch){
        if(str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="Neha";
        char target='h';
        System.out.println(search(str,target));
    }

}