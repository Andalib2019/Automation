package stringPackage;

public class ReverseString {

    public static void main(String[] args) {
        
        
        String x="ABCDF";//String variable
        char y[]=x.toCharArray();//Extract the data from x to y
        int size=y.length;//Calculate the size of the array
        char a[]= new char[size];//New array object
        int i=0;
        while(i!=size) {
            
            //a[i]=y[i];//copy the string
            
            a[size-1-i]=y[i];//Reverse the string
            ++i;//operation
            
        }
        System.out.println(y);
        System.out.println(a);

    }

}
