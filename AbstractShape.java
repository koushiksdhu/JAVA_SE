import java.util.*;
import java.lang.*;

public class AbstractShape {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.radius = 7;

        System.out.println(c.perimeter());
        System.out.println(c.area());

        Rectangle r = new Rectangle();
        r.length = 8;
        r.breadth = 16;

        System.out.println(r.perimeter());
        System.out.println(r.area());

        Shape s = r;//reference

        System.out.println(s.area());
        System.out.println(s.perimeter());

        Shape s1 = c;//reference

        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}

abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    double radius;
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    public double perimeter(){
        return 2 * (length + breadth);
    }
    public double area(){
        return length * breadth;
    }
}
