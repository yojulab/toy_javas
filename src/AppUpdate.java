import java.sql.*;

public class AppUpdate {
    public void UpdateFunction(Statement statement){
        String query = "update users SET NAME = 'SANGHUN'";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
