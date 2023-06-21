import java.lang.*;
import java.util.*;

public class Radix {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        if (str.matches("[01]+"))
            System.out.println(str+" is a Binary Number.");
        else if(str.matches("[0-7]+"))
            System.out.println(str+" is a Octal Number.");
        else if(str.matches("[0-9A-F]+"))
            System.out.println(str+" is a Hexa-Decimal Number.");
        else
            System.out.println("Invalid Input");
    }
}
}