package stringPackage;

import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {
       String m ="I Love my Mom";//create String variable
        String n[]= m.split("");//Divided the string by split Method using Array
        System.out.println(Arrays.toString(n));//Use Arrays  class to Convert the string in to One char or int
        //System.out.println("I Love my Mom");
        System.out.println(m);
        
        
        
       /* String country = "United States of America";
        String [] parts = country.split(" ");
        System.out.println(parts);
        */
    }
    
    

}
