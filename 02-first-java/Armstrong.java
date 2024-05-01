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
    // To check Armstrong between two given numbers
    System.out.println("Enter the staring range of the number");
        int n1=sc.nextInt();
        System.out.println("Enter the last range of the number");
        int n2=sc.nextInt();
        
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

