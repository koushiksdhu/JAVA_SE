public class multithreadingUsingThreadClass2 extends Thread{
    public void run(){
        System.out.println("World.");
    }
    public static void main(String args[]){
        multithreadingUsingThreadClass2 t = new multithreadingUsingThreadClass2();
        t.start();
        System.out.print("Hello ");
    }
}


