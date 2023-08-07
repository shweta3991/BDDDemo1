package MyJavaFiles;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetUpdateDemo {
    String url="jdbc:mysql://localhost:3306/universalit";
    String uname= "root";

    public static void main(String[] args) throws Exception{
        RowSetFactory rsf= RowSetProvider.newFactory();
        JdbcRowSet rs= rsf.createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/universalit");
        rs.setUsername("root");
        rs.setPassword("root123");
        rs.setCommand("select * from student");
        rs.execute();
        while (rs.next()){
            String address= rs.getString(1);
            if (((String)address).equalsIgnoreCase("Java")){
                rs.updateString(1,"Javascript");
                rs.updateRow();
            }
        }
        System.out.println("Record updated successfully");
        rs.close();
    }
}
