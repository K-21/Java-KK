import java.util.Scanner;
public class Fibonacci {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the  last  number of the series: ");
        int n = sc.nextInt();

        int first =0;
        int second =1;
        int temp;
        int count=2;
        while(count<=n){
        temp=second;
        second=first+second;
        first=temp;
        count++;
        }
        System.out.println(second);
    }
    
    
}
