/*
    Compound Interest Java Program
 */
import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal=sc.nextDouble();
        System.out.println("Enter the Rate:");
        double rate=sc.nextDouble();
        System.out.println("Enter the time:");
        double time=sc.nextDouble();
         double CI = principal * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI); 
        sc.close();
    }
}