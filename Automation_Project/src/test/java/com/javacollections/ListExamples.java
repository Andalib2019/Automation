package com.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;


public class ListExamples {
    public static void main(String[] args) {
        
        //Integer is data type and wrapper class from java
        
        List<Integer> number=new ArrayList<Integer>();
        
        number.add(10);//index 0
        number.add(15);//index 1
        number.add(20);//index 2
        number.add(22);//index 3
        number.add(15);//index 4
        number.add(15);
        number.add(22);
        number.add(22);
        number.add(null);
        number.add(null);
        number.add(null);
        number.add(null);
        number.add(22);
        number.add(22);
        number.add(30);
        number.add(30);
        //number.remove(3);
        number.remove(5);
        
        //How do you find the maximum and minimum value from the list?
        
        int max=Collections.max(number);
        System.out.println("The maximum value from the list is:"+max);
        
        
        int min=Collections.min(number);
        System.out.println("The minimum value from the list is:"+min);
        
        
        //Printing all values
        System.out.println("List of all values"+number);
        
        //How to remove the duplicate value from the list?
        
        number=(ArrayList<Integer>)number.stream().distinct().collect(Collectors.toList());
        
        System.out.println("List without duplicate value:"+number);
        
        
        
        //if we want to check the size
        
        System.out.println(number.size());
        
        //if we want to get a specific value at an index
        
        System.out.println(number.get(2));
        
        System.out.println(number.get(0));
        
        //if we want to print the whole List
        
        System.out.println(number);
        
        //using the basic loop
        
        for(int i=0;i<number.size();i++) {
            System.out.println(number.get(i));
            
            
        }
        
        
        //Using the advance loop
        
        for(Integer i:number) {
            
            System.out.println(i);
            
        }
        
        List<Integer>number1=new ArrayList<>();
        number1.add(35);
        
        
        List <String> names=new ArrayList<>();
        names.add("Aryan");//index 0
        names.add("Anee");//index 1
        names.add("Andalib");//index 2
        names.add("Miraj");//index 3
        names.add("Andalib");//index 4
        names.add("Andalib");//index 5
        names.add(null);
        names.add(null);
        names.add(null);
        
        
        //if and else condition to search in Collection
        
        if(names.contains("Aryan")) {
            System.out.println("The list contains name Aryan");
        }else if(names.contains("Andalib")) {
            System.out.println("The list contains name Andalib");
            
        }else {
            System.out.println("The list does not contain the names mentioned");
        }
        
        
        for(int i=0; i<names.size();i++) {
            System.out.println(names.get(i));
        }
        

        
        
        //Generic List
        
        List myList=new ArrayList();
        myList.add(10);
        myList.add("Name");
        
        //another way to write List
        
        List<Integer>number2=new ArrayList<Integer>(Arrays.asList(15,17));
        
        
        //LinkedList Example
        
        
        List<String> names1= new LinkedList<>();
        names1.add("Urmy");
        
        List<String> names2=new Vector<>();
        names2.add("LastName");
        names2.add("LastName");
        
        
        
        
        
        
        

        
    }

}
