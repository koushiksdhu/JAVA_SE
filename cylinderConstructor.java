import java.util.*;
import java.lang.*;

public class cylinderConstructor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        System.out.print("Enter the height of the circle: ");
        int h = sc.nextInt();
        cylinder c = new cylinder(r,h);
        System.out.println(c.display());
    }
}

class cylinder{
    private double radius;
    private double height;

    public cylinder(int r, int h){
        radius = r;
        height = h;
    }

    private double lidArea(){
        return Math.PI * radius * radius;
    }
    private double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    private double volume(){
        return lidArea() * height;
    }
    private double circumference(){
        return 2 * Math.PI * radius;
    }
    public String display(){
        return "Lid Area: "+lidArea()+"\nTotal Surface Area: "+totalSurfaceArea()+"\nVolume: "+volume()+"\nCircumference: "+circumference();
    }
}
