class NegativeAreaException extends Exception{
    public String toString(){
        return "Dimension of Rectangle cannot be negative.";
    }
}

public class throwThrowsUsingClasses {
    public static void main(String[] args){//throws Exception{
        try{
        meth();
        }
        catch(NegativeAreaException e){
            System.out.println(e);
        }
    }
    static int area(int l, int b) throws NegativeAreaException{
        if(l < 0 || b < 0) throw new NegativeAreaException();
        return l * b;
    }

    static void meth()throws NegativeAreaException{
        System.out.println("Area = "+area(-10, 0));
    }
}

