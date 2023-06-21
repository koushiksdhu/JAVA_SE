import java.lang.*;
import java.util.*;

public class binaryOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int binary;
        System.out.print("Enter the number: ");
        binary = sc.nextInt();
        String str = binary+"";
        System.out.println(str.matches("[01]*"));
    }
}
