import java.sql.*;
import java.util.*;

public class DBMS3 {
    public static void main(String args[]) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://My Java//SQLite//univ.db");
        PreparedStatement pstm = con.prepareStatement("Select * from students where deptno >= ?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department number: ");
        int deptno = sc.nextInt();
        pstm.setInt(1, deptno);
        ResultSet rs = pstm.executeQuery();
        int roll, dno;
        String name, city;
        while(rs.next()){
            roll = rs.getInt("roll");
            name = rs.getString("name");
            city = rs.getString("city");
            dno = rs.getInt("deptno");
            System.out.println(roll+" "+name+" "+city+" "+dno);
        }
        pstm.close();
        con.close();
    }    
}
