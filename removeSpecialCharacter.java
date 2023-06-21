import java.lang.*;
import java.util.*;

public class removeSpecialCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str = sc.next();
        String newString = str.replaceAll("[\\W]","");
        System.out.println(newString);
    }
}
