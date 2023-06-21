import java.lang.*;
import java.util.*;

public class noOfWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the Sentence: ");
        str = sc.nextLine();
        String words[] = str.split("\\s");   
        System.out.println(words.length);
    }
}
