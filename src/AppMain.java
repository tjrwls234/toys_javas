import java.sql.*;

public class AppMain {
    public static void main(String[] args) {
        // Done - MySQL workbench  실행 : JDBC 연결
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/study_sqls"; // 어떤 제품(mysql://)의 ip(localhost:3306)로 접속하는지 명시 , 라이브러리 방식(jdbc:)
        String user = "root"; //MySQL에서 접근하고 싶은 Connections
        String password = "*khacademy!"; //해당하는 Connections의 비밀번호
        try{
            // - database 지정
            Connection connection = DriverManager.getConnection(url, user, password);
        
            Statement statement = connection.createStatement(); // MySQL에서 에디터 화면을 띄운거랑 같다. query Edit

                // select statement
                AppSelect appSelect = new AppSelect();
                appSelect.SelectFuction(statement);

                // insert into
                AppInsert appInsert = new AppInsert();
                appInsert.InsertFunction(statement);

                // update
                AppUpdate appUpdate = new AppUpdate();
                appUpdate.UpdateFunction(statement);
                
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
