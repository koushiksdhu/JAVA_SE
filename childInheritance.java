import java.lang.*;
import java.util.*;

public class childInheritance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        grandChild p = new grandChild();
    }    
}

class parent{
   public parent(){
    System.out.println("Parent Constructor");
   }
}

class child extends parent{
    public child(){
        System.out.println("Child Constructor");
    }
}

class grandChild extends child{
    public grandChild(){
        System.out.println("Grand Child Constructor");
    }
}
