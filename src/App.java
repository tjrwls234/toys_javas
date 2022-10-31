import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input : ");
        //String input = scanner.next();

        // Done - MySQL workbench  실행 : JDBC 연결
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/study_sqls"; // 어떤 제품(mysql://)의 ip(localhost:3306)로 접속하는지 명시 , 라이브러리 방식(jdbc:)
        String user = "root"; //MySQL에서 접근하고 싶은 Connections
        String password = "*khacademy!"; //해당하는 Connections의 비밀번호
        try{
            // - database 지정
            Connection connection = DriverManager.getConnection(url, user, password);
        
            Statement statement = connection.createStatement(); // MySQL에서 에디터 화면을 띄운거랑 같다. query Edit
            // - SELECT * FROM users ;
            String query = "SELECT * FROM users ;"; // 입력하고 싶은 쿼리
            ResultSet resultSet = statement.executeQuery(query); //SELECT * FROM users 를 담아 놓은 그릇
            while(resultSet.next()){
                //각각의 컬럼들의 데이터 파일의 자료형 형식을 알고 있어야함.
                // - 결과 출력 (라인바이라인으로 값을 출력해야한다. 몇개인지 모를때는 while문, 갯수를 알때는 for문)
                String UNIQUE_ID = resultSet.getString("UNIQUE_ID"); // 컬럼의 이름을 입력
                System.out.print("UNIQUE_ID : " + UNIQUE_ID);
                System.out.print(", NAME : " + resultSet.getString("NAME")); // 컬럼의 이름을 입력);
                System.out.print(", EMAIL : " + resultSet.getString("EMAIL")); // 컬럼의 이름을 입력);
                System.out.print(", JOB : " + resultSet.getString("JOB")); // 컬럼의 이름을 입력);
                System.out.println();
                }

                // // insert into
                // query = "INSERT INTO users (UNIQUE_ID, NAME, EMAIL, JOB)"+
                // "VALUE ('U6', 'Seokjin', 'tjrwls234@gmail.com', 'IT Billing');";
                // statement.execute(query); //리턴할 필요가 없음 :  MySQL에서 직접 값을 넣는거지 리턴값이 없어서 굳이 넣지 않아도 됨

                 // update
                query = "UPDATE users SET NAME = 'SEOK';";
                statement.execute(query); //리턴할 필요가 없음 :  MySQL에서 직접 값을 넣는거지 리턴값이 없어서 굳이 넣지 않아도 됨

                


        } catch (SQLException exception){
            exception.printStackTrace();
            scanner.close();
        }

    }
}
