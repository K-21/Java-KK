/*
    Calculate Discount Of Product
 */
import java.util.Scanner;

public class discountProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marked price");
        int m=sc.nextInt();
        System.out.println("Enter the selling price");
        int s=sc.nextInt();
        int discount=m-s;
        int discountProduct=(discount/m)*100;
        System.out.println("The discount on the product is "+discountProduct+"%");
        sc.close();
    }
    
}
