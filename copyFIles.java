import java.io.*;

public class copyFIles {
    public static void main(String args[])throws IOException{
        String s;      
        try(FileInputStream fis = new FileInputStream("Test.txt");){
            byte b[] = new byte[fis.available()];
            fis.read(b);
            s = new String(b);
        }
        try(FileOutputStream fos = new FileOutputStream("TestOutput.txt");){
            byte b[] = s.toLowerCase().getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Sucessfully Copied in a New File");
        }
    }
}
