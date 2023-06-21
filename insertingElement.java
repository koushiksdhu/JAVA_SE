import java.lang.*;
import java.util.*;

public class insertingElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        for (int i = 0; i < size; i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the new element to be inserted: ");
        int ele = sc.nextInt();
        System.out.print("Enter the position where element to be inserted: ");
        int pos = sc.nextInt();
        for(int i = arr.length - 1; i > pos - 1; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = ele;
        for(int i : arr)
            System.out.println(i+" ");
    }    
}
