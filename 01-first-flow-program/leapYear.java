/*
Input a year and find whether it is a leap year or not.
*/
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n=sc.nextInt();
        if(n%4==0 && n%100!=0 ){
            System.out.println("Year  " +n +" is leap year ");
        }
        else if (n%400==0) 
        System.out.println("Year   "+n+" is leap year");
        else
        System.out.println("Year   "+n+" not leap year ");

        sc.close();
    }
    
}
