import java.lang.*;
import java.util.*;

public class HexaDecimalCheckl {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hexa-Decimal Value: ");
        String hexa = sc.next();
        System.out.println(hexa.matches("[0-9 A-F]+"));
    }
}
