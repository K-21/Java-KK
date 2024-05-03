/*
    Write a program to print the sum of negative numbers, 
    sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
    The list terminates when the user enters a zero.
 */
import java.util.Scanner;

public class sumneo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
       
        int sume=0;
        int sumo=0;
        int sumn=0;
        while(true)
        {
            int n = sc.nextInt();
            if(n>0)
            {
                if(n%2==0)
                    sume+=n;
                else
                    sumo+=n;
            }
            else if(n<0)
              sumn+=n;
            else
              break;
        }
        System.out.println("Sum of Even digits:"+sume);
        System.out.println("Sum of Odd digits:"+sumo);
        System.out.println("Sum of Negative digits:"+sumn);
        sc.close();
    }
}
