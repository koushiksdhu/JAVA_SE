import java.io.*;

public class copyFIles2 {
    public static void main(String args[])throws Exception{
        FileInputStream fis = new FileInputStream("Test.txt"); //To Read
        FileInputStream fis1 = new FileInputStream("TestOut.txt"); //To Read
        FileOutputStream fos = new FileOutputStream("TestAppend.txt"); //To Write
        int a;
        while((a = fis.read()) != -1){
                fos.write(a);
        }
        while((a = fis1.read()) != -1){
                fos.write(a);
        }
        fis.close();
        fis1.close();
        fos.close();
    }    
}
