import java.lang.*;
import java.util.*;

public class rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        rectangle1 r1 = new rectangle1();
        System.out.print("Enter the length of the rectangle: ");
        r1.length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        r1.breadth = sc.nextInt();
        System.out.println("Area of "+r1.length+" and "+r1.breadth+": "+r1.area());
        System.out.println("Perimeter of "+r1.length+" and "+r1.breadth+": "+r1.perimeter());
    }
}

class rectangle1{
    public int length;
    public int breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}
