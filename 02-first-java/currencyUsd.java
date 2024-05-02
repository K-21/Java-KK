/*
    Input currency in rupees and output in USD
 */
import java.util.Scanner;

public class currencyUsd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Currency");
        float n = sc.nextFloat();
        float usd= 83.47f*n;
        System.out.println("The currency in used is"+usd);
        sc.close();
    }
    
}
