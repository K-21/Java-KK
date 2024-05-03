/*
     Find Ncr & Npr
 */
import java.util.Scanner;

public class P_c {
    public static void main(String[] args) {
        // nCr calculation
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify distnict the element:");
        int n = sc.nextInt();
        System.out.println("Specify distnict the r element:");
        int r = sc.nextInt();
        int nf=factorial(n);
        int rf=factorial(r);
        int nr=factorial(n-r);
        int ncr=nf/(rf*nr);
        System.out.println("The nCr is:"+ncr);



        // nPr

        System.out.println("Specify distnict the element:");
        int np = sc.nextInt();
        System.out.println("Specify distnict the r element:");
        int rp = sc.nextInt();
        int pn=factorial(np);
       
        int per=factorial(np-rp);
        int npr=pn/(per);
        System.out.println("The nCr is:"+npr);
        sc.close();
    }
    static int factorial(int f){
        if(f==0){
            return 1;
        }
        else{
            return f*factorial(f-1);
        }
    }
    
    
}
