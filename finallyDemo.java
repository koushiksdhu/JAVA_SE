public class finallyDemo {
    static void meth() throws Exception{
        try{
            throw new Exception();
        }
        finally{//this message will definitely execute
            System.out.println("Final Message"); 
        }
    }
    public static void main(String args[]) throws Exception{
        meth();
    }
}
