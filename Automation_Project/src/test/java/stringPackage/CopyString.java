package stringPackage;

public class CopyString {
    
    //How to do copy and paste in java
    
    public static void main(String[] args) {
        
        String x="Phone Number";//String variable
        char y[]=x.toCharArray();//Extract the data from x to y
        int size=y.length;//Calculate the size of the array
        char a[]= new char[size];//New array object
        int i=0;
        while(i!=size) {
            
            a[i]=y[i];//copy the string
            ++i;//operation
            
        }
        System.out.println(y);
        System.out.println(a);
        
    }

}
