import java.util.*;
import java.lang.*;

public class circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ccl c1 = new ccl();
        System.out.print("Enter the radius of the circle: ");
        c1.radius = sc.nextInt();
        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Circumference: "+c1.circumference());
    }
}

class ccl {
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI * radius * 2;
    }
    public double circumference(){
        return perimeter();
    }

}