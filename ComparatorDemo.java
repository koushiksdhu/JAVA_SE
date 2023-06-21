import java.util.*;

public class ComparatorDemo {
    public static void main(String args[]){
        int a[] = {2, 4, 6, 8, 1, 3, 5, 7};
         Arrays.sort(a); // For small sized array.
         for(int i : a)
             System.out.print(i+" ");
        System.out.println("\n");

        Arrays.parallelSort(a); // For large sized array.
        for(int j : a)
            System.out.print(j+" ");
        System.out.println("\n");

        Integer b[] = {7, 1, 8, 5 ,2, 6, 3, 4};
        Arrays.sort(b); // Also works with wrapper class objects.
        for(Integer x: b)
            System.out.print(x+" ");
        System.out.println("\n");

        //Copying Array Elements.

        int c[] = Arrays.copyOf(a, 4);
        for(int j : c)
            System.out.print(j+" ");

        Arrays.fill(c, 10);
        for(int j : c)
            System.out.print(j+" ");
        System.out.println("\n");

        // Binary Search: Array must be sorted
        System.out.println(Arrays.binarySearch(a, 5));
        System.out.println();

        // Comparator
        Arrays.sort(b, new My()); // b[] must be Integer wrapper class.
        for(int p : b)
            System.out.print(p+" ");
    }
}
// My class implementing from Comparator class.
class My implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1 > i2) return -1;
        else if(i1 < i2) return 1;
        return 0;
    }
}
