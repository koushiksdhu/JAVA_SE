import java.lang.*;
import java.util.*;

public class Area_Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double area;
        float s;
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Sum of the traingle is: "+s);
        System.out.println("Area of the triangle is: "+area);
    }
    
}
