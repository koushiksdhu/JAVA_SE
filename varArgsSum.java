import java.lang.*;
import java.util.*;

public class varArgsSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number you want to sum: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum: "+sum(arr));
    }    

    static int sum (int ... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
        }
    }
