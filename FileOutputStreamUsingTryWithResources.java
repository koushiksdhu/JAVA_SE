import java.io.*;

public class FileOutputStreamUsingTryWithResources {
    public static void main(String args[])throws IOException{
        try(FileOutputStream fos = new FileOutputStream("Test1.txt");)
        {
            String str = "Hello, Welcome to Asansol WestBengal.";
            fos.write(str.getBytes());
            fos.close();
        }

    }
}
