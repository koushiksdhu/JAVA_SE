import java.lang.*;
import java.util.*;

public class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b, h;
        System.out.print("Enter the base of the rectangle: ");
        b = sc.nextInt();
        System.out.print("Enter the height of the trinagle: ");
        h = sc.nextInt();
        float area = 1f/2f*(b*h);
        System.out.println("Area of the triangle is: "+area); 
    }
}
