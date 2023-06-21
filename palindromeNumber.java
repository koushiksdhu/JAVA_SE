import java.lang.*;
import java.util.*;

public class palindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int a, reverse = 0;
        while(num > 0){
            a = num % 10;
            num = num / 10;
            reverse = reverse * 10 + a;
        }
        if(temp == reverse)
            System.out.println(temp+" is a Palindrome Number.");
        else
            System.out.println(temp+" is not a Palindrome Number.");
   }
}
