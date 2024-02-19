package com.cydeo;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // ArrayList<> accept only the Object belongs to the Integer class
        ArrayList<Integer> items = new ArrayList();
        items.add(0);
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(3);

        printDoubled(items);



    }
    // method static
    private static void printDoubled(ArrayList<Integer> items){
       // to print all elements from the array list
        for(Integer eachElement : items){
            System.out.println(  eachElement * 2);
        }
    }

}