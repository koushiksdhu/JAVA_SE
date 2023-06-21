import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class maxNoAmong3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b =  sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
        if(a > b && a > c)
            System.out.println(a+" is larger.");
        else if(b > c)
            System.out.println(b+" is larger.");
        else
            System.out.println(c+" is larger.");
    }
}