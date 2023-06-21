import java.io.*;

public class FileInputResources {
    public static void main(String args[])throws Exception{
        try(FileInputStream fis = new FileInputStream("Test.txt");){
            // byte b[] = new byte[fis.available()];
            // fis.read(b);
            // String str = new String(b);


            // int a; //this variable is used to store the ASCII value of each character.
            // while((a=fis.read())!=-1)
            //     System.out.print((char)a);

            //Reading Character by Character.
            int b;
            do{
                b =fis.read();
                if(b!=-1)
                    System.out.print((char)b);
                }while(b != -1);

            }
        }
    }

