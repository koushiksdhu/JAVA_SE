import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList <Integer> al1 = new ArrayList<Integer>(20);
        ArrayList <Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        al1.add(10);
        System.out.println(al1);
        al1.add(0, 5);
        System.out.println(al1);
        al1.addAll(al2);
        System.out.println(al1);
        al1.addAll(1, al2);
        System.out.println(al1);
        al1.add(5, 70);
        System.out.println(al1);
        al1.set(6, 100);
        System.out.println(al1);

        al1.forEach(n -> System.out.println(n));

        al1.forEach(System.out::println);

        //al1.forEach(n -> show(n));

        System.out.println(al1.contains(200));

        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));

        System.out.println(al1.lastIndexOf(70));

        System.out.println(al1);

        for(int i = 0; i < al1.size(); i++)
            System.out.print(al1.get(i)+" ");

        System.out.println("\n");

        for(Integer x : al1)
            System.out.print(x+" ");
            
        System.out.println("\n");

        for (Iterator <Integer> it = al1.iterator(); it.hasNext();){
            //Integer x = it.next();
            //int x = it.next();
            System.out.print(it.next()+" ");
        }

        System.out.println("\n");

        Iterator <Integer> it = al1.listIterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println("\n");

        al1.forEach(n -> show(n));
    }    
    static void show(int n){
        if ( n > 60 )
            System.out.print(n+" ");
    }
}
