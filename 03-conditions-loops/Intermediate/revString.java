/*
        Reverse A String In Java
 */
import java.util.Scanner;

public class revString {
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
        sc.close();
 }   
}
