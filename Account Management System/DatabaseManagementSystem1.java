import java.sql.*;

public class DatabaseManagementSystem1 {
    public static void main(String args[])throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://My Java//SQLite//univ.db");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("Select * from dept");
        int deptno;
        String dname;
        while(rs.next()){
                deptno = rs.getInt("deptno");
                dname = rs.getString("dname");
                System.out.println(deptno+" "+dname);
        }
        stm.close();
        con.close();
    }    
}
