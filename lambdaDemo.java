@FunctionalInterface
interface MyLambda{
    public void display();
}
// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }

public class lambdaDemo {
    public static void main(String args[]){
        // MyLambda m = new My();
        // MyLambda m = () -> {System.out.println("Hello World");};
        MyLambda m = new MyLambda() ->{
            public void display(){
                System.out.println("Hello World");}
        };
    
        m.display();
    }
}
