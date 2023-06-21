import java.lang.*;
import java.util.*;

public class reverseDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a, reverse = 0;
        while(num > 0){
            a = num % 10;
            num = num / 10;
            reverse = reverse * 10 + a;
        }
        System.out.println("Reverse: "+reverse);
   }
}
