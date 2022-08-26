package CoreJava.OOP;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConnection implements DatabaseConnection{
    @Override
    public Connection getConnection() throws SQLException {
        DataSource mySqlDS = new MysqlDataSource();
        Connection conn = mySqlDS.getConnection();
        return conn;
    }
}
