public class staticPractice1 {
    public static void main(String args[]){
        Test t1 = new Test();
        t1.show();
        //t1.x = 100; // static member is common for all the objects.
        t1.y = 50;
        t1.show();
        //Test.display(); //Accessing static method.
        Test t2 = new Test();
        t2.show();
    }
}

class Test{
    static int x = 10;
    int y = 20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);//+" "+y);//You cannot access non-static member y inside a static method.
    }
}
