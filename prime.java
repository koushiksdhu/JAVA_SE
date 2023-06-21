import java.lang.*;
import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isPrime(num) == true)
            System.out.println(num+" is a Prime Number.");
        else
            System.out.println(num+" is not a Prime Number.");
        }
    }
    
    static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
