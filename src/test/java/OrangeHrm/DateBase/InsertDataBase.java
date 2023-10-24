package OrangeHrm.DateBase;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataBase {

    private  ConectionDataBase conectionDataBase;

    public InsertDataBase(){
        this.conectionDataBase = new ConectionDataBase();
    }

    public static void insertEmployee(String firstName, String middleName,String lastName){
        String insertSql = "INSERT INTO newEmployees (firstName,middleName,lastName) VALUES "+
                "('" +firstName+ "','"+middleName+"','" +lastName+"')";

        try (Connection connection = ConectionDataBase.getConection();
             PreparedStatement prepInsert = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)){

            prepInsert.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
