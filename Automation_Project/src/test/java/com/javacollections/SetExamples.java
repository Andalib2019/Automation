package com.javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        
        
        //HashSet does not follow any insertion order
        //HashSet does not allow any duplicate
        
        Set <String> names=new HashSet<>();
        
        names.add("Aryan");
        names.add("Anee");
        names.add("Andalib");
        names.add("Miraj");
        names.add("Andalib");
        names.add("Andalib");
        names.add(null);
        names.add(null);
        names.add(null);
        
        System.out.println(names);
        
        
        //LinkedHashSet uses insertion order like a list
        
        Set<String> names1=new LinkedHashSet<>();
        
        names1.add("Aryan");
        names1.add("Anee");
        names1.add("Andalib");
        names1.add("Miraj");
        names1.add(null);
        names1.add(null);
        names1.add(null);
        
        System.out.println(names1);
        
        Set<String>names2=new TreeSet<>();
        
        names2.add("Aryan");
        names2.add("Anee");
        names2.add("Andalib");
        names2.add("Miraj");
        
        System.out.println(names2);
        
        //TreeSet follows ascending order that means small to big
        
        Set<Integer>number=new TreeSet<>();
        number.add(60);
        number.add(24);
        number.add(100);
        number.add(99);
        
        System.out.println(number);
        
        
        
        
        
        
        
        
    }

}
