import java.util.*;

public class HashTableLegacyClassDemo {
    public static void main(String args[]){
        Hashtable ht = new Hashtable(); // Legacy class should not be used now it has been replaced by generic class.
        
        Hashtable <Integer, String> Ht = new Hashtable<>(); // Generic class
        
        // Legacy Class

        System.out.println("Legacy Class: \n");
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        System.out.println("Value: ");
        Enumeration e1 = ht.keys();
        while(e1.hasMoreElements()) 
            System.out.println(e1.nextElement());
        System.out.println("\nKeys: ");
        Enumeration e = ht.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
        System.out.println();
        ht.computeIfAbsent(7, (k) -> "Z"+k);
        System.out.println(ht);

        // Generic class

        System.out.println("\nGeneric Class: \n");
        Ht.put(1, "A");
        Ht.put(2, "B");
        Ht.put(3, "C");
        Ht.put(4, "D");
        Ht.put(5, "E");

        System.out.println("Value: ");
        Enumeration e12 = Ht.keys();
        while(e12.hasMoreElements()) 
            System.out.println(e12.nextElement());
        System.out.println("\nKeys: ");
        Enumeration e2 = Ht.elements();
        while(e2.hasMoreElements())
            System.out.println(e2.nextElement());
        System.out.println();
        Ht.computeIfAbsent(7, (k) -> "Z"+k);
        System.out.println(Ht);


    }    
}
