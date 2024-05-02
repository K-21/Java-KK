/*
    Calculate Average Marks
 */
import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total subject for calculating average Marks");
        int n=sc.nextInt();
        int total=0;
        System.out.println("Enter the subject marks");
        for (int i=1;i<=n;i++){
            int marks=sc.nextInt();
            total=total+marks;
        }
        int average=total/n;
        System.out.println("The average marks of the student is "+average);
        sc.close();
    }
    
}
