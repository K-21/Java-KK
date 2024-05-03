/*
    Sum Of N Numbers
 */
import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        int no;
        System.out.println("Enter the number");
        while(true){
             no=sc.nextInt();
            n=n+no;
            if(no==0){
            break;
            }
        }
        System.out.println("The sum of the number is "+n);
        sc.close();
    }
}
