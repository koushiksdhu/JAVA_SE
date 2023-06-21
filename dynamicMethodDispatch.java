import java.lang.*;
import java.util.*;

public class dynamicMethodDispatch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}

class Super{
    public void meth1(){
        System.out.println("Super Method 1");
    }
    public void meth2(){
        System.out.println("Super Method 2");
    }
}

class Sub extends Super{
    public void meth2(){
        System.out.println("Sub Method 2");
    }
    public void meth3(){
        System.out.println("Sub Method 3");
    }
}
