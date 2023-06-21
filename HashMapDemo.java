import java.util.*;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap <Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E"));
        System.out.println(hm);
        hm.put(7, "R");
        hm.put(10, "X");
        System.out.println(hm);
    }    
}
