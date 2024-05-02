/*
    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 */
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal");
        int n=sc.nextInt();
        System.out.println("Enter the Time");
        int t=sc.nextInt();
        System.out.println("Enter the Rate");
        int r=sc.nextInt();
        int s_I=(n*r*t)/100;
        System.out.println("Simple Interest is"+s_I);
        sc.close();
    }    
}
