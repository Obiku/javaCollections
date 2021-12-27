package com.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
	// How to declare an Array
        // 1. ArrayList al = new ArrayList();
    // Allows: duplicate, insertion order not preserved and homogeneous data
        // 2.  ArrayList<Integer> al = new ArrayList<Integer>();
    //   Allows: duplicate, insertion order not preserved and heterogeneous data
        // 3. List al = nw ArrayList();

    // Adding element to an Arraylist
        ArrayList al = new ArrayList();
         al.add(30);
         al.add("Obiku");
         al.add(10.6);
         al.add(false);
        System.out.println(al);

        // Size of an Array
        System.out.println("Number of an element present = " +(al.size()));





    }
}
