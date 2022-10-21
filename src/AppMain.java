import java.sql.*;
public class AppMain {
    public static void main(String[] args){
        // Done - MySQL workbench  실행 : JDBC - 
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/study_sqls";
        String user = "root";
        String password = "*khacademy!";
        // - database 지정
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            // query Edit
            Statement statement = connection.createStatement();

            // select statement

            // insert into

            // update

        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
