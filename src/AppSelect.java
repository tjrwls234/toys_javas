import java.sql.*;

public class AppSelect {
    public void SelectFuction(Statement statement){
        // - SELECT * FROM users ;
        String query = "SELECT * FROM users ;";
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String UNIQUE_ID = resultSet.getString("UNIQUE_ID");
            System.out.print("UNIQUE_ID : " + UNIQUE_ID);
            System.out.print(", NAME : " + resultSet.getString("NAME"));
            System.out.print(", EMAIL : " + resultSet.getString("EMAIL"));
            System.out.print(", JOB : " + resultSet.getString("JOB"));
            System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
