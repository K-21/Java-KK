/*
    To find out whether the given String is Palindrome or not.
 */
import java.util.Scanner;

public class palindroneString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String org=sc.next();
        String dupl="";
        char ch;
        for(int i=org.length()-1;i>=0;i--){
                ch=org.charAt(i);
                dupl=dupl+ch;
        }
        System.out.println(dupl);
        System.out.println(org);
        if(org.equals(dupl))
        System.out.println("The String is Palindrone");
        else
            System.out.println("The String is not Palindrone");    
        sc.close();
    }
    
}
