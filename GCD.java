import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+ isGCD(a, b));
    }    

    static int isGCD(int x, int y){
        while (x != y){
            if(x > y)
                x = x - y;
            else
                y = y - x;
       }
       return x;
    }
}
