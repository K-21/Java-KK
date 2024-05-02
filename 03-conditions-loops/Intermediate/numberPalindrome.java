/**
  Find if a number is palindrome or not
*/
import java.util.Scanner;
public class numberPalindrome{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=a.nextInt();  
        int check=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==check)
        System.out.println("The given number   "+rev+" is Palindrome");
        else
        System.out.println("The given Number   "+rev+" is not Palindrome");
        a.close();
    }
}