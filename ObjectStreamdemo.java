import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private String dept;
    private Float average;
    public static int Data = 10;
    public transient int d  = 4;

    public Student(){}
    public Student(int rollNo, String name, String dept, Float average) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.average = average;
        Data = 100;
        d = 500; 
    }

    public String toString(){
        return "Student Details: \n\nRoll No.: "+rollNo+"\nName: "+name+"\nDepartment: "+dept+"\nAverage: "+average+"\nData: "+Data+"\nTransient: "+d;        
    }
}

public class ObjectStreamdemo{
    public static void main(String args[])throws Exception{

        // FileOutputStream fos = new FileOutputStream("Student2.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Student s = new Student(27, "Koushik Sadhu", "IT", 95.0f);
        // oos.writeObject(s);

        // fos.close();
        // oos.close();

        FileInputStream fis = new FileInputStream("Student2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = (Student)ois.readObject();
        System.out.println(s1);

        fis.close();
        ois.close();
    }
}