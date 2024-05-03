/*
      Perfect Number In Java
      Perfect numver is always even number
 */
import java.util.Scanner;

public class perfectN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            sum=sum+i;
        }
        // System.out.println(n);
        // System.out.println(sum);
        if(sum==n)
        System.out.println("Perfect Number "+n);
        else
        System.out.println("Not a Perfect Number "+n);
        sc.close();
    }
    
}
