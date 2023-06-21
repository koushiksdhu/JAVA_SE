import java.io.*;

public class FileHandlingDemo {
    public static void main(String args[])throws Exception{
        File f = new File("E://Coding/Java");

        System.out.println(f.isDirectory()+"\n\n");
        File list[] = f.listFiles();
        for(File x : list)
            System.out.println(x.getParent()+" "+x.getName()); // File Name with Path Address.

        // String list[] = f.list();
        // for(String x : list)
        //     System.out.println(x); // Only File Name.
    }    
}
