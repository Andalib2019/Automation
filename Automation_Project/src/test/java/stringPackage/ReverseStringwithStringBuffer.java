package stringPackage;

public class ReverseStringwithStringBuffer {

    public static void main(String[] args) {
        
        String str="Anee";
        StringBuffer stb = new StringBuffer(str);
        stb.reverse();
        System.out.println(stb);

    }

}
