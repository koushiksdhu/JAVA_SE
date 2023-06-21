public class exceptionHandling1 {
   public static void main(String args[]){ 
        int a = 10;
        int b = 2;
        try{//this statement will check whether there is any error or not if there is no error then this statement will execute and program will be terminated normally.
        int c = a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e){ //this statement will execute when there is any exception/error.
            System.out.println(e);
        }
        finally{//this statement will always execute
        System.out.println("End of the program.");
   } 
}
}
