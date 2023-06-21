import java.lang.*;
import java.util.*;

public class sortStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array string: ");
        int size = sc.nextInt();
        String str[] = new String[size];
        for (int i = 0; i < str.length; i++){
            System.out.print("String "+(i+1)+" : ");
            str[i] = sc.next();
        }
        Arrays.sort(str);
        for(String x : str){
            System.out.print(x+" ");
        }
    }    
}
