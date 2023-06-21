import java.io.*;

public class ReadAllBytesTime {
    public static void main(String args[])throws Exception{
        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }    
}
