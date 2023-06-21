import java.lang.*;
import java.util.*;

public class switchCaseWebsite {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Web Address: ");
        String web = sc.next();
        String protocol = web.substring(0, web.indexOf(":"));
        String domain = web.substring(web.lastIndexOf(".")+1);
        System.out.print("Domain: ");
        switch(domain){
            case "com": System.out.println("Commercial");
                        break;
            case "in": System.out.println("Indian");
                        break;
            case "biz": System.out.println("Business");
                        break;
            case "gov": System.out.println("Government");
                        break;
            case "net": System.out.println("Network");
                        break;
            default: System.out.println("Invalid Input");
                        break;
        }
        System.out.print("Protocol: ");
        switch(protocol){
            case "https": System.out.println("Hyper Text Transfer Protocol Secured");
                            break;
            case "http": System.out.println("Hyper Text Transfer Protocol Secured");
                            break;
            case "ftp": System.out.println("File Transfer Protocol");
                            break;
            default: System.out.println("Invalid Input");
        }
    }
}
