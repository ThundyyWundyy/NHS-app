// Purpose: To create a simple data source class that can be used to connect to a database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class SimpleDataSource {
    public static void main(String[] args) {
        // load the file into properties object
        // set the driver, url, username and password from info in properties object
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
