import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamUsingTryCatch {
    public static void main(String args[]){
        try{
        FileOutputStream fos = new FileOutputStream("E:/Coding/Java/Test.txt"); // Forward / slashes must be used.
        String str = "My Name is Koushik Sadhu.";
        // fos.write(str.getBytes());

         byte b[] = str.getBytes();
        // fos.write(b);

        fos.write(b, 4, str.length()-4);
        fos.close();
        }
    catch(FileNotFoundException e){System.out.println(e.getMessage());}
    catch(IOException e){System.out.println(e.getMessage());}
}
}
