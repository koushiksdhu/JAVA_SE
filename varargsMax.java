import java.lang.*;
import java.util.*;

public class varargsMax {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of element: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Number: "+maximum(arr));
       
    }    
    static int maximum(int ... arr){
        int i, max = Integer.MIN_VALUE;
        if(arr.length == 0) return 0;
        for (i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
