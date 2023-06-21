import java.lang.*;
import java.util.*;

public class secondMaximum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max1, max2;
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        max1 = max2 = arr[0];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        max1 = max2 = arr[0];
        for(int x : arr){
            if (x > max1){
                max2 = max1;
                max1 = x;
            }
            else if (x > max2) 
                max2 = x;
        }
        System.out.println("Second Largest Element: "+max2);
    }    
}
