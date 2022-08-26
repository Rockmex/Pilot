package CoreJava.OOP;

import oracle.jdbc.pool.OracleDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class OracleConnection implements DatabaseConnection{
    @Override
    public Connection getConnection() throws SQLException {
        DataSource oracleDS = new OracleDataSource();
        Connection conn = oracleDS.getConnection();
        return conn;
    }
}
