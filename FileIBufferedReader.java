import java.io.*;

public class FileIBufferedReader {
    public static void main(String args[])throws Exception{
        FileReader fr = new FileReader("Test.txt");
        BufferedReader br = new BufferedReader(fr);
        // int a;
        // while((a = br.read()) != -1)
        //     System.out.print((char)a);
            

        //     System.out.println("\n\nFile: "+fr.markSupported()); 
        //     System.out.println("Buffer: "+br.markSupported());
            
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            br.mark(10);
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            br.reset();
            System.out.print((char)br.read());
            System.out.print((char)br.read());

            System.out.println("\n\nString: "+br.readLine());

            fr.close();
            br.close();
    }    
}
