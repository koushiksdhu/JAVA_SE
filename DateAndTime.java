import java.util.*;

public class DateAndTime {
    public static void main(String args[]){
        // System.out.println(System.currentTimeMillis());
        // System.out.println(System.currentTimeMillis()/1000/60/60/24/365+1970);

        // To Check Leap Year in Java.
        System.out.print("Enter the Year: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();       
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(y) ? y+" is a Leap Year" : y+ " is not a Leap Year");
    }
}
