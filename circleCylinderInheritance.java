import java.util.*;
import java.lang.*;

public class circleCylinderInheritance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        System.out.print("Enter the height: ");
        int h = sc.nextInt();
        cylinder c = new cylinder(r, h);
        System.out.println(c);
    }
}

class circle{
   private int radius;

    // public circle(int radius) {
    //     this.radius = radius;        
    // }

    public void setRadius(int radius){
        this.radius = radius;;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class cylinder extends circle{
    private int height;
    public cylinder(int radius, int height){
         this.setRadius(radius);
          this.height = height;
    }

    public double volume(){
        return area() * height;
    }

    public String toString(){
        return "Area: "+area()+"\nPerimeter: "+perimeter()+"\nCircumference: "+circumference()+"\nVolume: "+volume()+"\n";
    }
}