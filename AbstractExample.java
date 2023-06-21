import java.util.*;
import java.lang.*;

public class AbstractExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Super s1; //reference
        sub s2 = new sub();
        Super s1 = new sub();
        s1.meth1();
        s1.meth2();
        s2.meth2();
    }   
}

abstract class Super{
    public Super(){
        System.out.println("Super Constructor.");
    }
    public void meth1(){
        System.out.println("Method 1");
    }
    abstract void meth2();
}

class sub extends Super{
    public void meth2(){
        System.out.println("Method 2");
    }
}