/*
    Power In Java
 */
import java.util.Scanner;
import java.lang.Math;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which power you want:");
        int n=sc.nextInt();
        System.out.println("Enter the  power you want:");
        int p=sc.nextInt();
        System.out.println("The power of number is  "+(Math.pow(n, p)));
        sc.close();
    }
    
}
