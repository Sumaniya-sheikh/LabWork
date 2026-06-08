package week_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDB {

    private static final Logger logger =
            LogManager.getLogger(LoggingDB.class);

    public static void main(String[] args) {

        Connection con = null;

        try {
            con = connectToDatabase(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "SUMU",
                    "1234");

            System.out.println("Connection successful");

            performOperation(con);

        } catch (DatabaseConnectionException e) {

            System.out.println(
            "Exception: DatabaseConnectionException - " + e.getMessage());

            logger.error("DatabaseConnectionException occurred.");
            System.out.println("Log: [ERROR] DatabaseConnectionException occurred.");

        } finally {
            try {
                if (con != null) con.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {}
        }
    }

    static Connection connectToDatabase(String url,String u,String p)
            throws DatabaseConnectionException {
        try {
            return DriverManager.getConnection(url,u,p);
        } catch (SQLException e) {
            throw new DatabaseConnectionException(
                    "Could not connect to the database.");
        }
    }

    static void performOperation(Connection con)
            throws DatabaseConnectionException {
        try {
            Statement st = con.createStatement();
            st.executeQuery("SELECT * FROM dummy_table");
        } catch (SQLException e) {
            throw new DatabaseConnectionException(
                    "An error occurred during the database operation.");
        }
    }
}