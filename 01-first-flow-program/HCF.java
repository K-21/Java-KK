/*
Take 2 numbers as inputs and find their HCF .
*/
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=s.nextInt();
        int b=s.nextInt();
        int hcf=1;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0&&b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is "+hcf);
               s.close();
    }
//        s.close();
    }
    

