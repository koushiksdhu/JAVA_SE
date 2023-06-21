import java.util.*;
import java.lang.*;

public class studentClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        System.out.print("Enter the Roll Number of the Student: ");
        s1.roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the Student: ");
        s1.name = sc.nextLine();
        System.out.print("Math Marks: ");
        s1.math = sc.nextInt();
        System.out.print("Physics Marks: ");
        s1.phy = sc.nextInt();
        System.out.print("Chemistry Marks: ");
        s1.chem = sc.nextInt();
        System.out.println("\n\nStudent Details:\n"+s1.studentDetails());
        System.out.println("Total Marks: "+s1.total());
        System.out.println("Average: "+s1.average());
        System.out.println("Grade: "+s1.grade());
    }
}

class student{
    public int roll_no;
    public String name;
    public String course;
    public int math, phy, chem;
    public int total(){
        return math + phy + chem;
    }
    public float average(){
        return total() / 3;
    }
    public char grade(){
        char grade = 0;
        if(average() > 0 && average() <= 100){
            if(average() <= 100 && average() >= 90)
                grade = 'A';
            else if(average() >= 80)
                grade = 'B';
            else if(average() >= 70)
                grade = 'C';
            else if(average() >= 60)
                grade = 'D';
            else if(average() >= 50)
                grade = 'E';
            else if(average() >=1)
                grade = 'F';
        }
        return grade;
    }
    public String studentDetails(){
        return "Name: "+name+"\nRoll No.: "+roll_no;
    }
}