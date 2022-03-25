package stringPackage;

public class Palindrome {

    public static void main(String[] args) {
        
        
        String x ="mom ";//String variable
        char y[]=x.toCharArray();//Extract the data from x to y
        int size=y.length;//Calculate the size of the array
        char a[]= new char[size];//New array object
        int i=0;
        while(i!=size) {
            
            //a[i]=y[i];//copy the string
            
            a[size-1-i]=y[i];//Reverse the string
            ++i;//operation
            
        }
        //System.out.println(y);
       // System.out.println(a);
        
         i=0;
        while(i!=size) {
            if(a[i]!=y[i]) {
                
                System.out.println("Not a palindrome");
                break;
                
                
            }
            else {
                ++i;
                continue;
                
            }
            
            
        }
        
        System.out.println("It is a palindrome");

    }

}
