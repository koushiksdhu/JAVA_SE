import java.lang.*;
import java.util.*;

public class multilpyingMatrices{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter tbe number of column: ");
        int col = sc.nextInt();
        int A[][] = new int [row][col];
        int B[][] = new int [row][col];
        System.out.println("Enter the element of the 1st array: ");
        int i, j;
        for (i = 0; i < A.length; i++){
            for (j = 0; j < A[0].length; j++){
                System.out.printf("Element [%d][%d]: ",i , j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of the 2nd array: ");
        for (i = 0; i < B.length; i++){
            for (j = 0; j < B[0].length; j++){
                System.out.printf("Element [%d][%d]: ",i , j);
                B[i][j] = sc.nextInt();
            }
        }
        int C[][] = new int[row][col];
        for (i = 0; i < C.length; i++){
            for (j = 0; j < C[0].length; j++){
                C[i][j] = 0;
                for (int k = 0; k < C.length; k++){
                C[i][j] = C[i][j] + A[i][k] * B[k][j];
               }
               System.out.format("%2d ", C[i][j]);
            }
            System.out.println();
        }
    //     System.out.println("Sum of two matrices is: \n\n");
    //     for (int x[] : C){
    //         for (int y : x){
    //             System.out.format("%2d ", y);
    //         }
    //         System.out.println();
    //     }    
    }
}
