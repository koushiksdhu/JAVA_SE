import java.lang.*;
import java.util.*;

public class generateRollNo {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(s1.getRoll());
        System.out.println(s4.getRoll());
        System.out.println(s3.getRoll());
        System.out.println(s2.getRoll());
    }
}

class Student{
    private String rollNo;
    private static int counter = 1;

    private static String generateRoll(){
        Date d = new Date();
        String rno = "Univ - " +" "+(d.getYear() +  1900)+" - "+counter++;
        return rno;
    }

    public Student(){
        rollNo = generateRoll();
    }

    public String getRoll(){
        return rollNo;
    }
}
