import java.lang.*;
import java.util.*;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, a;
        int count = (int)Math.log10(num)+1;
        while(num > 0){
            a = num % 10;
            num = num / 10;
          sum += Math.pow(a, count);
        }
        if(temp == sum)
            System.out.println(temp+" is an Armstrong Number.");
        else
            System.out.println(temp+" is not an Armstrong Number.");
    }
}
