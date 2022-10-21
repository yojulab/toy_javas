import java.sql.*;

public class AppInsert {
    public void InsertFunctioin(Statement statement){
        try {
            String query = "INSERT INTO users(UNIQUE_ID, NAME, EMAIL, JOB)" +
                        "VALUE ('U6', 'Sanghun', 'sanghun@naver.com', 'IT Billing')";
            statement.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
