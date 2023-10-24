package OrangeHrm.DateBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultDataBase {

    private ConectionDataBase conectionDataBase;


    public ConsultDataBase(){
        this.conectionDataBase = new ConectionDataBase();
    }

    public static void consultUsers() throws SQLException {
        Connection testCon = ConectionDataBase.getConection();
        if(testCon != null){
            System.out.println("conecto exitosamente");
            Statement stm = testCon.createStatement();
            ResultSet rst = stm.executeQuery("Select * From [Users]");
            while(rst.next()){
                System.out.println("user: " + rst.getString(1)+  "password: " + rst.getString(2));
            }
        }else {
            System.out.println("No conecto");
        }
    }
}
