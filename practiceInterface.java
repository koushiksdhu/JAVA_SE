import java.lang.*;
import java.util.*;

public class practiceInterface {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(Test.X);
        My m = new My();
        m.meth3();
    }    
}

interface Test{
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    default void meth3(){
        System.out.println("Meth 3 of Test");
    }
}
interface Test2 extends Test{
    void meth4();
}

class My implements Test2{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}