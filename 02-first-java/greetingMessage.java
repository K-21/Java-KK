/*
   Take name as input and print a greeting message for that particular name.
 */
import java.util.Scanner;
public class greetingMessage {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Hello  "+name+"  have a great day");
        sc.close();
    }
    
}
