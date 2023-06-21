public class methodOverridding {
    public static void main(String args[]){
        superClass sup = new superClass();
        sup.display();
        subClass sub = new subClass();
        sub.display();
        superClass sup1 = new subClass();
        sup1.display();
        //subClass sub1 = new superClass(); // not possible to override
        //sub1.display();
    }
}

class superClass{
    public void display(){
        System.out.println("Super Class");
    }
}

class subClass extends superClass{
    @Override
    public void display(){
        System.out.println("Sub Class");
    }
}
