import java.util.*;
import java.lang.*;

public class maxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size= sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < A.length; i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            A[i] = sc.nextInt();
        } 
        System.out.print("Maximum element present in the array: "+isMax(A));
    }    

    static int isMax(int arr[]){
        int Max = Integer.MIN_VALUE;
        for(int i : arr){
            if (i > Max)
                Max = i;
        }
        return Max;
    }
}
