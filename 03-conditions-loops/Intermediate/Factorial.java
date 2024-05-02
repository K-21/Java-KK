/*
     Factorial Program In Java
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want factorial:");
        int n=sc.nextInt();
        int start=1;
        for(int i=1;i<=n;i++){
            start=start*i;
        }
        System.out.println("Factorial is:"+start);
        sc.close();
    }
    
}
