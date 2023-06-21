import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String args[]){
        LinkedHashSet <String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("K");
        lhs.add("G");
        lhs.add("B");
        // Duplicate elements will not be printed because it is a set.
        Iterator <String> itr = lhs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }    
}
