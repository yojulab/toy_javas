import java.sql.*;

public class AppUpdate {
    public void UpdateFunction(Statement statement){
        query = "update users SET NAME = 'SANG'";
        statement.execute(query);
    }
}
