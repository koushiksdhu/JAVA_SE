import java.io.*;

public class AppendTwoFilesIntoOne {
    public static void main(String args[])throws Exception {
        FileInputStream fis1 = new FileInputStream("TestOut.txt");
        FileInputStream fis2 = new FileInputStream("Test.txt");
        FileOutputStream fos = new FileOutputStream("AppendedTest.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int a;
        while((a = sis.read()) != -1)
            fos.write(a);
        fis1.close();
        fis2.close();
        sis.close();
        fos.close();

    }    
}
