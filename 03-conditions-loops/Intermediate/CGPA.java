/*
     Calculate CGPA Java Program
 */
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  CGPA, CGPAper,total=0 ;  
        System.out.println("Enter the total subjects to calculate CGPA:");
        int n=sc.nextInt();
        System.out.println("Enter the  subject marks");
        for(int i=1;i<=n;i++){
          double n1=sc.nextDouble();
          total=total+n1;
        }
        
    CGPA = (total)/(n);  
    CGPAper = (float)(9.5 * (CGPA));  
    System.out.println(" CGPA Percentage is:  "+CGPAper);  
    sc.close();
    }  
}
