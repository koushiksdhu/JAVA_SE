import java.util.*;
import java.lang.*;

public class multiThreadingUsingRunnable {
    public static void main(String args[]){
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        System.out.print("Hello, I am "); 
    }
}

class My implements Runnable{
    public void run(){
        System.out.println("Koushik."); 
    }
}
