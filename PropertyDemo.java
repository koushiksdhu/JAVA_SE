import java.util.*;
import java.io.*;

public class PropertyDemo {
    public static void main(String args[])throws IOException{
        Properties p = new Properties();
        p.setProperty("Brand", "HP");
        p.setProperty("Processor", "Ryzen 5");
        p.setProperty("OS", "Windows 11");
        p.setProperty("Model", "Omen");

        System.out.println(p);

        p.store(new FileOutputStream("PropertyData.txt"), "Laptop"); // "Laptop" is a comment.

        p.storeToXML(new FileOutputStream("PropertyData.xml"), "Laptop");
     
        // Loading text file.
        p.load(new FileInputStream("PropertyData.txt"));
        System.out.println(p);
        System.out.println(p.getProperty("Brand"));
        System.out.println(p.getProperty("OS"));

        // loading XML file.
        p.load(new FileInputStream("PropertyData.xml"));
        System.out.println(p.getProperty("Processor"));
        System.out.println(p.getProperty("Model"));

    }    

}
