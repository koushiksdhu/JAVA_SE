import java.lang.*;
import java.util.*;
public class superclassRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Cuboid c1 = new Cuboid(4, 5, 6);
        // c1.display();

    }
}

class Rectangle{
    protected int length;
    protected int breadth;
    // int x = 10;
     public Rectangle(int length, int breadth){
         this.length = length;
         this.breadth = breadth;
     }
     public Rectangle(){
        length = 1;
        breadth = 1;
     }
    public int Area(){
        return length * breadth;
    }
}

class Cuboid extends Rectangle{
    protected int height;
    // int x = 20;
    public Cuboid(){
        height = 1;
    }
    public Cuboid(int height){
        this.height = height;
    }
    public int volume(){
        return length * breadth * height;
    }
    public Cuboid (int l, int b, int h){
        super(l, b);
        height = h;
    }
    // void display(){
    //     System.out.println(super.x);
    //     System.out.println(x);
    // }
}


