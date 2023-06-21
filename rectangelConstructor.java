import java.lang.*;
import java.util.*;

public class rectangelConstructor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Rectangle r1 = new Rectangle(); //default or non-parameterized constructor
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);
        System.out.println(r2.display());

    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }

    public String display(){
        return "Area: "+area()+"\nPerimeter: "+perimeter();
    }
}
