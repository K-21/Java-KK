/*
    Calculate Average Of N Numbers
 */
import java.util.Scanner;

public class averageN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        int count=0;
        int no;
        System.out.println("Enter the number");
        while(true){
             no=sc.nextInt();
           count++;
            n=n+no;
            if(no==0){
            count--;
           // System.out.println(count);
            break;
            }
        }
        // System.out.println(count);
        // System.out.println(n);
        int avg=n/count;
        System.out.println("Average of N Numbers:"+ avg);
        sc.close();
    }
    
}
