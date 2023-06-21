import java.util.*;
import java.io.*;

public class StringTokenizerDemo {
    public static void main(String args[])throws Exception{
        String data = "Name:Koushik Sadhu,Dept.:IT,College Name:Asansol Engineering College,Degree:B.Tech,Stream:Information Technology\nSession:2020-2024\n";

        StringTokenizer stk = new StringTokenizer(data, ",");
        while(stk.hasMoreTokens())  
            System.out.println(stk.nextToken());
    
        StringTokenizer stk2 = new StringTokenizer(data, ",:");
        while(stk2.hasMoreTokens())  
            System.out.println(stk2.nextToken());

        // Accessing from file.
        System.out.println("\nAccessing from file.\n");
        FileInputStream fis = new FileInputStream("StringTokenizerDemoText.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String d = new String(b);
        StringTokenizer st = new StringTokenizer(d, "->");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
