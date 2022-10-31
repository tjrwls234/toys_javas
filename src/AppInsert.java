import java.sql.*;

public class AppInsert{
    public void InsertFunction(Statement statement){
        try {
            String query = "INSERT INTO users (UNIQUE_ID, NAME, EMAIL, JOB)"+
                "VALUE ('U7', 'Seokjin', 'tjrwls234@gmail.com', 'IT Billing');";
                statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}