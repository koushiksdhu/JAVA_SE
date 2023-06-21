import java.lang.*;
import java.util.*;

public class subjectConstructor {
    public static void main(String args[]){
        
        Subject s[] = new Subject[4];
        s[0] = new Subject("PCCCS401","Discrete Mathematics", 100);
        s[1] = new Subject("PCCCS402","Computer Architecture", 100);
        s[2] = new Subject("PCCCS403","Formal Language and Automata Theory", 100);
        s[3] = new Subject("PCCCS404","Design and Analysis of Algorithms", 100);
        for(Subject i : s)
            System.out.println(i);


    }
}

class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int obtainMarks;

    public Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getObtainMarks(){
        return obtainMarks;
    }

    public void setObtainMarks(int om){
        obtainMarks = om;
    }

    public String toString(){
        return "Subject ID: "+getSubID()+"\nSubject Name: "+getName()+"\nMax Marks: "+getMaxMarks()+"\nObtained Marks: "+getObtainMarks()+"\n";
    }
}

class Student{
    private int roll;
    private String name;
    private String dept;
    private Subject[] subjects;

    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public Subject[] getSubjects(){
        return subjects;
    }

    public void setDept(String dept){
        this.dept = dept ;
    }

    public Student(int roll, String name, String dept, Subject[] subjects){
        this.roll = roll;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public void setSubjects(Subject ...s){
        for(int i = 0; i < s.length; i++){
            subjects[i] = s[i];
        }
    }
    public String toString(){
        return "Roll No.:"+getRoll()+"\nName: "+getName()+"\nDepartment: "+getDept()+"\n";
    }


}


