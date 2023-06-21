public class Interfaces {
    public static void main(String args[]){
        Test t = new myTest();
        t.meth1();
        t.meth2();
    }
}

interface Test{
    public void meth1();
    public void meth2();
}

class myTest implements Test{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
}
