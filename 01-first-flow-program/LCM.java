/*
Take 2 numbers as inputs and find their LCM.
*/
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
             // int n1 = 72, n2 = 120, lcm;
             System.out.println("Enter the 1st number");
              int n1 =sc.nextInt();
              System.out.println("Enter the 2nd number");
              int n2 =sc.nextInt();
              int lcm;
              
              // maximum number between n1 and n2 is stored in lcm
              lcm = (n1 > n2) ? n1 : n2;
          
              // Always true
              while(true) {
                if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                  System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                  break;
                }
                ++lcm;
              }
              sc.close();
            }
          
}
