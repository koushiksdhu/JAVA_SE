import java.io.*;

public class byteArrayOutputStream {
    public static void main(String args[])throws IOException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        // To print in the console.
        //byte []a = bos.toByteArray();
        // for(int i : a)
        //     System.out.print((char)i);

        // To write in a file.
        bos.writeTo(new FileOutputStream("newTextByte.txt"));
        bos.close();
    }    
}
