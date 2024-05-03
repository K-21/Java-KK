/*
    Sum Of A Digits Of Number
 */
import java.util.Scanner;

public class digitsAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sum=digits(n);
        System.out.println("Sum of Digits: "+sum);
        sc.close();
    }
    static int digits(int no){
       
        if(no<10)
         return no;
         else 
         {
            int sum=0;
            int i=no;
            while(i>=0){
                int sum1;
                sum1=no%10;
                sum=sum+sum1;
                no=no/10;
                i--;
                }
                System.out.println("Summ of Digits: "+sum);
                return digits(sum);
            }
    }
    
}
