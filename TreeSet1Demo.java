import java.util.*;
import java.util.Map.*;

public class TreeSet1Demo {
    public static void main(String args[]){

        TreeMap <Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
        System.out.println(tm);

        tm.put(4, "E");
        tm.put(8, "Z");
        
        System.out.println(tm);

        System.out.println(tm.ceilingEntry(6)); // if that key is not present than it will print its next key value pair.
        System.out.println(tm.containsKey(5)); // False
        System.out.println(tm.containsKey(8)); // True
        System.out.println(tm.get(5)); // null value
        System.out.println(tm.get(4));
        System.out.println(tm.keySet());

        Entry <Integer, String> e = tm.firstEntry(); // this requires importing of java.util.Map.*;
        System.out.println(e.getKey()+" "+e.getValue());
    }
}
