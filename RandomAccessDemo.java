import java.io.*;

public class RandomAccessDemo {
    public static void main(String args[])throws IOException{
        RandomAccessFile rf = new RandomAccessFile("Data.txt", "rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());

        rf.write('e');

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());

        rf.seek(3);
        System.out.println((char)rf.read());

        rf.skipBytes(3);
        System.out.println((char)rf.read());

        System.out.println(rf.getFilePointer());

        rf.seek(rf.getFilePointer() - 2);
        System.out.println((char)rf.read());

        rf.seek(rf.getFilePointer() + 2);
        System.out.println((char)rf.read());
        
        rf.close();
    }    
}
