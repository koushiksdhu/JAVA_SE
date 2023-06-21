import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList <Integer> ll1 = new LinkedList<>();
        LinkedList <Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80));

        System.out.println(ll1+"\n"+ll2);

        ll1.add(10);
        System.out.println(ll1);

        ll1.add(0, 5);
        System.out.println(ll1);

        ll1.addAll(ll2);
        System.out.println(ll1);

        ll1.add(5, 70);
        System.out.println(ll1);

        ll1.set(6, 100);
        System.out.println(ll1);

        ll1.forEach(System.out::println);

        ll1.forEach(n -> System.out.println(n));

        System.out.println(ll1.contains(25));

        System.out.println(ll1.get(5));

        System.out.println(ll1.indexOf(70));

        System.out.println(ll1.lastIndexOf(70));
        for(int i = 0; i < ll1.size(); i++)
            System.out.println(ll1.get(i));

        for(Integer x : ll1)
            System.out.println(x);

        for(Iterator <Integer> it = ll1.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        ll1.forEach((x) -> {System.out.println(x);});

        Iterator <Integer> it = ll1.listIterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        ll1.addFirst(40);
        System.out.println(ll1);

        ll1.addLast(100);
        System.out.println(ll1);

        ll1.clear();
        System.out.println(ll1);
        
        ll1.add(5);
        ll1.add(10);
        ll1.add(15);
        ll1.add(20);
        System.out.println(ll1);

        
        Iterator <Integer> it = ll1.descendingIterator(); // returns in a reverse order.
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println();

        System.out.println(ll1.element());

        System.out.println(ll1.getFirst());

        System.out.println(ll1.getLast());

        ll1.offer(17);
        System.out.println(ll1);

        ll1.offerFirst(1);
        System.out.println(ll1);

        ll1.offerLast(1000);
        System.out.println(ll1);

        System.out.println(ll1.peek());

        System.out.println(ll1.peekFirst());

        System.out.println(ll1.peekLast());

        System.out.println(ll1.poll()); // Head Element is returned and popped out.
        System.out.println(ll1);

        System.out.println(ll1.pollFirst());
        System.out.println(ll1);

        System.out.println(ll1.pollLast());
        System.out.println(ll1);

        System.out.println(ll1.pop());
        System.out.println(ll1);

        System.out.println(ll1.pollFirst());
        System.out.println(ll1);

        System.out.println(ll1.pollLast());
        System.out.println(ll1);

        ll1.push(55);
        System.out.println(ll1);

        System.out.println(ll1.remove());
        System.out.println(ll1);

        System.out.println(ll1.remove(0));
        System.out.println(ll1);

        System.out.println(ll1.removeFirst());
        System.out.println(ll1.removeLast());
        System.out.println(ll1);

        System.out.println(ll1.removeFirstOccurrence(1));
        System.out.println(ll1.removeLastOccurrence(5));
        System.out.println(ll1);

        System.out.println(ll1.set(1, 105)); // will return the element which is to be replaced by a new element.
        System.out.println(ll1);

        System.out.println(ll1.size()); // will return the total number present in the list.

        Spliterator <Integer> in = ll1.spliterator();
        in.forEachRemaining((i) -> {System.out.println(i);});

        System.out.println(ll1.toArray());
        System.out.println(ll1.getClass().getName());

        System.out.println(ll1.toString());
        System.out.println(ll1);
        System.out.println(ll1.toString().getClass().getName());

    }
}    

