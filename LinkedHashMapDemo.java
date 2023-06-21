import java.util. *;

public class LinkedHashMapDemo {
    public static void main(String args[]){
        LinkedHashMap <Integer, String> lhm1 = new LinkedHashMap<>(5);
        LinkedHashMap <Integer, String> lhm2 = new LinkedHashMap<>(5, 0.75f, true);

        // Inserting Order
        System.out.println("Inserting Order: ");
        lhm1.put(1, "A");
        lhm1.put(2, "B");
        lhm1.put(3, "C");
        lhm1.put(5, "E");
        String s1 = lhm1.get(2);
        s1 = lhm1.get(5);
        s1 = lhm1.get(1);
        lhm1.put(6, "F");
        lhm1.forEach((k, v) -> System.out.println("("+k+", "+v+")"));

        System.out.println("\nAccessing Order: ");
        // Accessing Order

        lhm2.put(1, "A");
        lhm2.put(2, "B");
        lhm2.put(3, "C");
        lhm2.put(5, "E");
        String s2 = lhm2.get(2);
        s2 = lhm2.get(5);
        s2 = lhm2.get(1);
        lhm2.put(6, "F");
        lhm2.forEach((k, v) -> System.out.println("("+k+", "+v+")"));
    }    
}
