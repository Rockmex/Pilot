package CoreJava.OOP;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class SqlServerConnection implements DatabaseConnection{
    @Override
    public Connection getConnection() throws SQLException {
        DataSource sqlServerDS = new SQLServerDataSource();
        Connection conn = sqlServerDS.getConnection();
        return conn;
    }
}
