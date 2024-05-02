/*
   Calculate Batting Average
 */
import java.util.Scanner;

public class battingAverage {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the runs:");
        int runs = sc.nextInt();
        System.out.println("Enter the innings:");
        int innings = sc.nextInt();
        System.out.println("Enter the not outs:");
        int notOuts = sc.nextInt();
        int out = innings - notOuts;
 
        // Check for 0 times out
        if (out == 0)
                out=-1;
        // Calculate batting average
        int avg = (runs) / out;
        if (avg == -1)
            System.out.print("NA");
        else
            System.out.print("The batting Average:"+avg);
        sc.close();
    }
    
}
