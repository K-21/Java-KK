/*
    Calculate Distance Between Two Points
 */
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start point in km");
        int fst=sc.nextInt();
        System.out.println("Enter the last point in km");
        int sst=sc.nextInt();
        int distance=sst-fst;
        System.out.println("The disstance between Two points are"+distance);
        sc.close();
        
    }
    
}
