/*
    Java Program Vowel Or Consonant
 */
import java.util.*; 

public class Vowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet to check for vowel or constraint:");
        char ch = sc.next().charAt(0);
        int count=1;
        char [] arr={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<arr.length;i++){
            if(ch==arr[i]){
                System.out.println("The alphabet is vowel");
                count=0;
                break;
            }
            
        }
        //System.out.println(count);
        if(count==0){
            System.out.println("Thank you");
        }
        else
        System.out.println("The alphabet is consonant");
        sc.close();
    }
}
    

