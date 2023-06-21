import java.lang.*;
import java.util.*;

public class gmail_Regex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the gmail ID: ");
        str = sc.next();
        int pos = str.indexOf('@');
        if(str.matches("\\w.*gmail.*"))
            System.out.println("Yes, it is a Google mail ID");
        else
            System.out.println("No, it is not a Google mail ID");
        System.out.println("Username: "+(str.substring(0, pos)));
        System.out.println("Domain Name: "+(str.substring(pos+1)));
    }
}
