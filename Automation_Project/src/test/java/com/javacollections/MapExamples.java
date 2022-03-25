package com.javacollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    
    public static void main(String[] args) {
        
        //Example with Integer as Key and String as value
        
        Map<Integer, String> names= new HashMap<>();
        names.put(10,"Anee");
        names.put(20, "Aryan");
        names.put(25, "Andalib");
        names.put(35, "Andalib");
        names.put(30, "Miraj");
        names.put(30,"Miraj" );//not allowed because it has the same key
        names.put(30,"Miraj" );
        names.put(null,null );
        names.put(50,null );
        names.put(60,null );
        names.put(null, "Miraj");
        
        System.out.println(names);
        
        
        
        
        
        Map<Integer, String> names2=new LinkedHashMap<>();
        
        names2.put(10,"Anee");
        names2.put(20, "Aryan");
        names2.put(25, "Andalib");
        names2.put(35, "Andalib");
        names2.put(30, "Miraj");
        names2.put(30,"Miraj" );//not allowed because it has the same key
        names2.put(30,"Miraj" );
        names2.put(null,null );
        names2.put(50,null );
        names2.put(60,null );
        names2.put(null, "Miraj");
        
        System.out.println(names2);
        
        
        
        Map<Integer, String> names3=new TreeMap<>();
        
        
        names3.put(10,"Anee");
        names3.put(20, "Aryan");
        names3.put(25, "Andalib");
        names3.put(35, "Andalib");
        names3.put(30, "Miraj");
        names3.put(30,"Miraj" );//not allowed because it has the same key
        names3.put(30,"Miraj" );
        names3.put(null,null );
        names3.put(50,null );
        names3.put(60,null );
        names3.put(null, "Miraj");
        
        System.out.println(names3);
        
        
        for(Map.Entry<Integer,String>m:names3.entrySet()) {
            System.out.println("Key:"+m.getKey()+"Value:"+m.getValue());
            
        }
        
        
        //Example with String as Key and String as value
        
        Map<String, String> names1=new HashMap<>();
        names1.put("City", "Jackson Heights");
        names1.put("City", "Woodside");
        names1.put("City", "Flushing");
        names1.put("Zipcode", "11372");
        names1.put("Zipcode1", "11372");
        
        System.out.println(names1);
        
        
        
        
        
        
        
        
        
        
    }

}
