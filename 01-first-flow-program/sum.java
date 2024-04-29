import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number:");
        char ch = s.next().charAt(0);
        char q='X';
        char w='x';
        for(int i=1;i<=10000000;i++){
           
            if(ch== q|| ch == w){
                String k=Integer.toString(sum);
                System.out.println("The addition of number up till now is:"+k);
                break;
            }
            else{
                int j=ch;
                sum=sum+j;  
                System.out.println("The addition of number up till now is:"+sum);
            }
              
        }
        System.out.println("Thank you");
        s.close();

    }
}