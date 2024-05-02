/*
   Armstrong Number In Java
 */
import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    int a,arm=0,no,temp1;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
    no=sc.nextInt();
    sc.close();
    temp1=no;
    for( ;no!=0;no/=10 )
    {
      a=no%10;
      arm=arm+(a*a*a);
    }
   // System.out.println(arm);
    if(arm==temp1)
    System.out.println(temp1+" is a armstrong number ");
    else
    System.out.println(temp1+" is not a armstrong number ");

  }
}