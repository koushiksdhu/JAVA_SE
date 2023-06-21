import java.util.*;

public class ArrayDequeueDemo {
    public static void main(String args[]){
        ArrayDeque <Integer> dq = new ArrayDeque();

        dq.offerLast(100);
        dq.offerLast(200);
        dq.offerLast(300);
        dq.offerLast(400);
        
        dq.pollFirst(); // will pop out head element.

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        System.out.println(dq);
        } 
}
