import java.lang.*;
import java.util.*;

public class diplayDigitsInWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a, rev = 0;
        while (num > 0){
            a = num % 10;
            num = num / 10;
            rev = rev * 10 + a;
        }
        while (rev > 0){
            a = rev % 10;
            rev = rev / 10;
            switch(a){
                case 0: System.out.print("Zero ");
                        break;
                case 1: System.out.print("One ");
                        break;
                case 2: System.out.print("Two ");
                        break;
                case 3: System.out.print("Three ");
                        break;
                case 4: System.out.print("Four ");
                        break;
                case 5: System.out.print("Five ");
                        break;
                case 6: System.out.print("Six ");
                        break;
                case 7: System.out.print("Seven ");
                        break;
                case 8: System.out.print("Eight ");
                        break;
                case 9: System.out.print("Nine ");
                        break;
                default: System.out.print("Invalid Input");
            }
        }

    }
}
