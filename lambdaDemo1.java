@FunctionalInterface
interface MyLambda{
    public int add(int a, int b);
}

public class lambdaDemo1 {  
    public static void main(String args[]){
        MyLambda ml = (a, b) -> a+b; // we may or may not use return statement here -> MyLambda ml = (a, b) -> {return a + b};
        System.out.println("Sum: "+ml.add(4, 4));
    }
    
}
