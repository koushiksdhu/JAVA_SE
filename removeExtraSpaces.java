import java.lang.*;
import java.util.*;

public class removeExtraSpaces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the Sentence: ");
        str = sc.nextLine();
        String newString = str.replaceAll("[\\s]+"," ");   
        System.out.println(newString.trim());
    }
}
