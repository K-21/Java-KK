import java.util.*;

public class product {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int q=0;
        System.out.print("Enter the number:");
        int a = p.nextInt();
        for(int i=1;i<=10;i++){
            q=a*i;
             System.out.println(q);
        }
       
        p.close();
    }
    
}
