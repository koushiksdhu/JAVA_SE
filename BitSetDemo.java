import java.util.*;

public class BitSetDemo {
    public static void main(String args[]){
        BitSet b1 = new BitSet();
        b1.set(0);
        b1.set(2);
        b1.set(4);
        b1.set(6);
        b1.set(8);

        BitSet b2 = new BitSet();
        //b2.set(0);
        b2.set(1);
        //b2.set(2);
        b2.set(3);
        //b2.set(4);
        b2.set(5);
        //b2.set(6);
        b2.set(7);
        //b2.set(8);

        b1.and(b2);
        System.out.println(b1);
        System.out.println(b2);

        b1.or(b2);
        System.out.println(b1);
        System.out.println(b2);

        b1.xor(b2);
        System.out.println(b1);
        System.out.println(b2);

        b1.flip(0, b1.length());
        System.out.println(b1);
        b2.flip(0, b2.length());
        System.out.println(b2);

    }
}
