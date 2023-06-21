public class throwThrows {
    public static void main(String[] args){//throws Exception{
        try{
        meth();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static int area(int l, int b) throws Exception{
        if(l < 0 || b < 0) throw new Exception("Values cannot be in negative.");
        return l * b;
    }

    static void meth()throws Exception{
        System.out.println("Area = "+area(-10, 0));
    }
}

