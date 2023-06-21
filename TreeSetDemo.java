import java.util.*;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet <Integer> ts = new TreeSet<>(List.of(10, 20, 40, 30, 70, 80, 10));
        System.out.println(ts); // Sorted and Unique element will be printed.
        System.out.println(ts.ceiling(55)); // If that value is not present then it will print its next available value.
        System.out.println(ts.ceiling(40));
    }    
}
