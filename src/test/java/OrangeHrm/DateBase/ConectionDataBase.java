package OrangeHrm.DateBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionDataBase {

    private static Connection con;

    public static Connection getConection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-QFD4VE3I:1433; databaseName = OrangeHrm","DataBase", "Prueba04");
        } catch (Exception e) {
           con = null;
           e.printStackTrace();
        }
        return con;
    }

}
