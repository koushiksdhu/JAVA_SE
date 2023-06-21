import java.io.*;

public class charWriter {
    public static void main(String args[])throws IOException{
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        CharArrayReader cr = new CharArrayReader(c);
        CharArrayWriter cw = new CharArrayWriter(20);
        int a;
        while((a = cr.read()) != -1){
            cw.write(a);
        }
        cr.close();
        cw.close();
    }    
}
