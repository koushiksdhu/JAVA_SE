import java.io.*;

public class ReadOneByteTime{
    public static void main(String args[])throws Exception{
        byte a[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(a);
        int b;
        while((b = bis.read()) != -1)
            System.out.print((char)b);
        bis.close();
    }
}