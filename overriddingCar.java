import java.lang.*;
import java.util.*;

public class overriddingCar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.changeGear();
        luxuryCar c2 = new luxuryCar();
        c2.start();
        c2.accelerate();
        c2.changeGear();
        c2.sunRoof();
        Car c = new luxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.sunRoof();
    }
}

class Car{
    public void start(){
        System.out.println("Car is started.");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear is changed.");
    }
}

class luxuryCar extends Car{
    public void changeGear(){
        System.out.println("Automatic gear changed successfully.");
    }
    public void sunRoof(){
        System.out.println("Sun roof is opened successfully.");
    }
}