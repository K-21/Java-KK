/*
    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 */
import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int n2=sc.nextInt();
        System.out.println("Enter the operation you want");
        char c=sc.next().charAt(0);
        if(c=='+')
        {System.out.println("The addition of two numbers are:"+(n1+n2));}
        else if(c=='*')
        {System.out.println("The addition of two numbers are:"+(n1*n2));}
        else if(c=='-')
        {System.out.println("The addition of two numbers are:"+(n1-n2));}
        else if(c=='/')
        {System.out.println("The addition of two numbers are:"+(n1/n2));}
        else
        {System.out.println("Please enter valid operator");}
        sc.close();
    }
    
}
