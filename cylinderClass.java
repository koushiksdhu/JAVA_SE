import java.util.*;
import java.lang.*;

public class cylinderClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        cylinder c = new cylinder();
        System.out.print("Enter the radius: ");
        c.radius = sc.nextInt();
        System.out.print("Enter the height: ");
        c.height = sc.nextInt();
        System.out.println("Lid Area: "+c.lidArea());
        System.out.println("Circumference: "+c.circumference());
        System.out.println("Total Surface Area: "+c.totalSurfaceArea());
        System.out.println("Volume: "+c.volume());
    }    
}

class cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    public double volume(){
        return lidArea() * height;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
