import java.util.*;
import java.lang.*;

public class multithreadingUsingThreadClass {
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();
        System.out.println("World.");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Hello ");
    }
}
