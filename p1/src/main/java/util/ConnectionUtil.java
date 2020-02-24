package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection connection;
    private static final String LOGIN = "root";
    private static final String PASSWORD = "soBusoduh0";
    private static final String URL = "jdbc:mysql://localhost:3306/laptop";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
}
