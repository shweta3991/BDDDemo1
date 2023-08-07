package MyJavaFiles;

import java.sql.Connection;
import java.sql.DriverManager;

public class TransactionDemoForIsolationDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String name= "root";
        String password= "root123";
        Connection con= DriverManager.getConnection(url,name,password);
        System.out.println(con.getTransactionIsolation());
        con.setTransactionIsolation(1);
        System.out.println(con.getTransactionIsolation());
    }
}