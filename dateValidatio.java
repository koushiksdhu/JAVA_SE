import java.lang.*;
import java.util.*;

public class dateValidatio {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = sc.next();
        System.out.println(date.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"));
    }
}
