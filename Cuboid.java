import java.lang.*;
import java.util.Scanner;

public class Cuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l, b, h;
        System.out.print("Enter the length of the cuboid: ");
        l = sc.nextInt();
        System.out.print("Enter the breadth of the cuboid: ");
        b = sc.nextInt();
        System.out.print("Enter the height of the cuboid: ");
        h = sc.nextInt();
        System.out.println("Volume of the cuboid is: "+(l*b*h));
    }    
}
