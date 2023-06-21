import java.io.*;

public class pipedDemo {
    public static void main(String args[])throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);
        //OR
        //pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis); 

        p.start();
        c.start();
    
    }
}

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream os){ // Parameterized-Constructor
        this.os = os;
    }
    public void run(){
        int count = 1;
        while (true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }catch(Exception e){}
            }
        }
    }

class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream is){ // Parameterized-Constructor
        this.is = is;
    }
    public void run(){
        int x;
        while(true){
            try{
                x = is.read();
                System.out.println("Consumer: "+x);
                System.out.flush();
                Thread.sleep(10);}catch(Exception e){}
            }
        }
    }
