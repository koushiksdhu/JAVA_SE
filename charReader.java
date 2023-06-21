import java.io.*;

public class charReader {
    public static void main(String args[])throws Exception{
        char []c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        CharArrayReader cr = new CharArrayReader(c);
        int a;
        while((a = cr.read()) != -1)
            System.out.print((char)a);
        cr.close();
    }
}
