import java.lang.*;
import java.util.*;

public class leapYear {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int year = scan.nextInt();
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        System.out.println(year+" is a leap year.");
    else
        System.out.println(year+" is not a leap year.");
    }
}
