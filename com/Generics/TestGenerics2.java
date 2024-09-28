package com.Generics;

public class TestGenerics2 {
    public static void main(String[] args) {
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        System.out.println(m.get());

        CustomArrayList<Integer> list5= new CustomArrayList<>();
        list5.add(2);
        list5.add(5);
        System.out.println(list5.toString());
    }
}
