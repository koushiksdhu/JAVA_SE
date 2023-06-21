import java.lang.*;
import java.util.*;

public class fibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term: ");
        int last = sc.nextInt();
        int n1 = 0, n2= 1, n3 = n1 + n2;
        System.out.print(n1+" "+n2+" ");
        while(n3 <= last){
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }         
    }    
}
