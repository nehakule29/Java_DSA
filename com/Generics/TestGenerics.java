package com.Generics;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestGenerics {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("one");
        list.add("two");
        String s=list.get(0);
        System.out.println(s);
        // list.add(7);

        
    }
}
