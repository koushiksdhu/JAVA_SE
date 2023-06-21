import java.lang.*;
import java.util.*;

public class sumOfAllElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int  arr[] = new int[size];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all the element is: "+sum);
    }    
}
