package Health;
import java.sql.*;
import java.util.Scanner;


public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // - MySQL workbench  실행 : JDBC
        // - User/password와 접속 IP:port 접속
        String url = "jdbc:mysql://localhost:3306/health_club";
        String user = "root";
        String password = "*khacademy!";

        try{
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println("DB연결 성공");
        // - query Edit
        Statement statement = connection.createStatement();
        
        

        System.out.println("홀리몰리 헬스장 만족도 설문조사\n");
        String input;
        do{
            System.out.print("-----------------------------------------------\n"
                            + "P. 설문시작 | S. 통계 | D. 삭제 | C.회원중복확인 | SR.검색 | DA.전체삭제 | Q. 종료\n"
                            + "-----------------------------------------------\n"
                            + "선택 : ");
            input = scanner.nextLine();
            switch(input) {
                case "P" :
                    new AppStart().startFunction(statement, scanner, connection);
                    //버퍼 제거 ㅠ
                    scanner.nextLine();
                    break;
                case "S" :

                    break;
                case "Q" :

                    break;
                case "D" :

                    break;
                case "C" :
                    new AppCheck().checkFuction(statement, scanner);
                    break;
                case "SR" :

                    break;
                case "DA" :

                    break;
                default :
                    System.out.println("=== 재입력 바람 ===");
                    break;
            }
        } while (!input.equals("Q"));
        }catch(SQLException exception){
            System.out.println("DB접속 실패");
            exception.printStackTrace();
        }
    }
}
