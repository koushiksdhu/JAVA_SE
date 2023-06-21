public class multiThreadingUsingRunnable2 {
    public static void main(String args[]){
        Test t = new Test();
        Thread th = new Thread(t);
        th.start();
        int i = 1;
        while(i <= 10){
            System.out.println("Hello");
            i++;
        }
    }
}

class Test implements Runnable{
    public void run(){
        int i = 1;
        while(i <= 10){
            System.out.println("World");
            i++;
        }
    }
}