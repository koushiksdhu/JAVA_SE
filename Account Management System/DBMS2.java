import java.sql.*;

public class DBMS2 {
    public static void main(String args[])throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://My Java//SQLite//univ.db");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("Select * from Students");
        int roll;
        String name, city;
        int deptno;
        while(rs.next()){
            roll = rs.getInt("roll");
            name = rs.getString("name");
            city = rs.getString("city");
            deptno = rs.getInt("deptno");
            System.out.println(roll+" "+name+" "+city+" "+deptno);
        }
        stm.close();
        con.close();
    }
}
