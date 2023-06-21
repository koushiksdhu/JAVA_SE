import java.lang.*;
import java.util.*;

public class deletingElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be deleted: ");
        int ele = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ele){
                index = i;
            }
        }
        size--;
        for (int a = index; a < size; a++){
            arr[a] = arr[a+1];

            
        }
        for (int i = 0; i < size; i++)   
            System.out.print(arr[i]+" ");
    }
}
