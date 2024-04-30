import java.util.*;
public class Armstrong {
  public static void main(String[] args) {

    // To check for only a number like 153
    int n=153;
      int temp=n;
      int sum=0;;
      while(temp>0){
      int rem= temp%10;
      sum=sum+(rem*rem*rem);
      temp=temp/10;

      }
      System.out.println(sum);
    if (n==sum){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not an Armstrong number");
    }
  
    // To check for any number given by user
    int a,arm=0,no,temp1;
    Scanner sc=new Scanner(System.in);
    sc.close();
    System.out.println("Enter a number");
    no=sc.nextInt();
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


// to check for all numbers from 100 to 1000 which are Armstrong numbers

//int result=0;
for (int number=100;number<=1000;number++){
  
  int temp2=number;
  int lastdigit=temp2%10;
  temp2/=10;

  int secondDigit=temp2%10;
  temp2/=10;

  int thirdDigit=temp2%10;
  temp2/=10;

  int sumC=(lastdigit*lastdigit*lastdigit)+(secondDigit*secondDigit*secondDigit)+(thirdDigit*thirdDigit*thirdDigit);
 // System.out.println(sumC);
  if (sumC==number){
    System.out.println("Armstrong number:"+sumC);
  }
  
}
}
}

