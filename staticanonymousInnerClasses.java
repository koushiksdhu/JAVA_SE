import java.util.*;
import java.lang.*;

public class staticanonymousInnerClasses {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Outer.My m = new Outer.My();
        m.show();
    }
}

class Outer{
    int x = 10;
    static int y = 20;
    static class My{
        public void show(){
            System.out.println(y);
            //System.out.println(x); // error beacuse x is non-static        
        }
    }
}

