import java.lang.*;
import java.util.*;

public class areaMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        System.out.println("Area of a circle: "+area(r));

    }
    static int area(int r){
        return (int)Math.PI * r * r;
    }
    
}

