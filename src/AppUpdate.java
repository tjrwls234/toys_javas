import java.sql.*;

public class AppUpdate{
    public void UpdateFunction(Statement statement){
        try {
            String query = "UPDATE users SET NAME = 'SEOKJIN';";
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}