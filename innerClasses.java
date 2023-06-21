import java.util.*;
import java.lang.*;

public class innerClasses {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Outer o = new Outer();
        o.OuterDisplay();
        Outer.Inner i = new Outer().new Inner();
        }
}

class Outer{
    int x = 10;
    class Inner{
        int y = 20;
        void InnerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void OuterDisplay(){
        Inner i = new Inner();
        i.InnerDisplay();
        System.out.println(i.y);
    }
}
