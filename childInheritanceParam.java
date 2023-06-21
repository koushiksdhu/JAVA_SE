import java.util.*;
import java.lang.*;

public class childInheritanceParam {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        child c1 = new child(4, 16);
        
    }
}

class parent{
    public parent(){
        System.out.println("Non - Parameterized Constructor of Parent.");
    }
    public parent(int x){
        System.out.println("Parameterized Constructor of Parent."+x);
    }
}

class child extends parent{
    public child(){
        System.out.println("Non - Parameterized Constructor of Child.");
       }
    public child(int y){
        System.out.println("Parameterized Constructor of Child.");
    }

    public child(int x, int y){
        super(x);
        System.out.println("2 Parameterized Constructor of child."+y);
    }
}

class grandChild extends child{
    public grandChild(){
        System.out.println("Non - Parameterized Constructor of Grand Child.");
    }
    public grandChild(int x){
        System.out.println("Parameterized Constructor of Grand Child.");
    }
}