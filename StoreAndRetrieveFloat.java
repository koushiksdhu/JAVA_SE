import java.io.*;

public class StoreAndRetrieveFloat {
    public static void main(String args[])throws IOException{
        float list[] = {1.25f, 8.25f, 9.6f, 74.6f, 87.2f,4.0f, 7.0f, 4.0f, 6.2f};

        FileOutputStream fos = new FileOutputStream("DataFloat.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(list.length);
        for(float i : list)
            dos.writeFloat(i);
        fos.close();
        dos.close();

        FileInputStream fis = new FileInputStream("DataFloat.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        for(int i = 0; i < length; i++){
            System.out.println(dis.readFloat());
        }
        fis.close();
        dis.close();
    }   
}
