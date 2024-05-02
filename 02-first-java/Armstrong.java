/*
    To find Armstrong Number between two given number.
*/
import java.util.*;
public class Armstrong {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    // To check Armstrong between two given numbers
    System.out.println("Enter the staring range of the number");
        int n1=sc.nextInt();
        System.out.println("Enter the last range of the number");
        int n2=sc.nextInt();
        sc.close();
        if(n1>n2){
            System.out.println("range not specified correctly");
            System.exit(n1);
            }
        while (n1<=n2){
       int temp2=n1;
      int lastdigit=temp2%10;
      temp2/=10;
    
      int secondDigit=temp2%10;
      temp2/=10;
    
      int thirdDigit=temp2%10;
      temp2/=10;
    
      int sumC=(lastdigit*lastdigit*lastdigit)+(secondDigit*secondDigit*secondDigit)+(thirdDigit*thirdDigit*thirdDigit);
     // System.out.println(sumC);
      if (sumC==n1){
        System.out.println("Armstrong number:"+sumC);
      }
      n1++;
    }
  
}
}

