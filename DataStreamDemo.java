import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
    Float average;    
}

public class DataStreamDemo {
    public static void main(String args[])throws Exception{

        // Writing Files

        FileOutputStream fos = new FileOutputStream("Student.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 27;
        s.name = "Koushik Sadhu";
        s.dept = "IT";
        s.average = 94.0f;

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.average);

        fos.close();
        dos.close();

        // Reading Files

        FileInputStream fis = new FileInputStream("Student.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s1 = new Student();
        s1.rollNo = dis.readInt();
        s1.name = dis.readUTF();
        s1.dept = dis.readUTF();
        s1.average = dis.readFloat();

        System.out.println("Roll No.: "+s1.rollNo+"\nName: "+s1.name+"\nDepartment: "+s1.dept+"\nAverage: "+s1.average);

        fis.close();
        dis.close();
    }    
}
