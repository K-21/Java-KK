/*
     Calculate Depreciation of Value

     Depreciation of Value = (V1 * (1 - R/100) ^ T)
 */
import java.util.Scanner;
import java.lang.Math;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter V1 value:");
        float v1=sc.nextFloat();
        System.out.println("Enter R value:");
        float r=sc.nextFloat();
        System.out.println("Enter T value:");
        float t=sc.nextFloat();
        float D = (float)(v1 * Math.pow((1 - r / 100), t));
        System.out.println("Depreciation value is : "+D);
        sc.close();
    }
}
