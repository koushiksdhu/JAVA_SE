import java.lang.*;
import java.util.*;

public class displayDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a;
        while (num > 0){
            a = num % 10;
            num = num / 10;
            System.out.println(a);
        }
    }
}
