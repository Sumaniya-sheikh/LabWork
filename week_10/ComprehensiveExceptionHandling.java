package week_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComprehensiveExceptionHandling {

    private static final Logger logger =
            LogManager.getLogger(ComprehensiveExceptionHandling.class);

    public static void main(String[] args) {

        Connection con = null;

        try {

            con = connectToDatabase(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "password");

            performOperation(con);

            System.out.println("Operation successful");

        } catch (DatabaseConnectionException e) {

            System.out.println(
            "Exception: DatabaseConnectionException - " + e.getMessage());

            logger.error("DatabaseConnectionException occurred.");
            System.out.println(
            "Log: [ERROR] DatabaseConnectionException occurred.");

        } catch (DatabaseOperationException e) {

            System.out.println(
            "Exception: DatabaseOperationException - " + e.getMessage());

            logger.error("DatabaseOperationException occurred.");
            System.out.println(
            "Log: [ERROR] DatabaseOperationException occurred.");

        } finally {

            try {
                if (con != null) {
                    con.close();
                }

                System.out.println("Connection closed");

                logger.info("Database connection closed successfully.");
                System.out.println(
                "Log: [INFO] Database connection closed successfully.");

            } catch (Exception e) {
                logger.error("Error closing connection", e);
            }
        }
    }

    static Connection connectToDatabase(String url, String user, String pass)
            throws DatabaseConnectionException {

        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            throw new DatabaseConnectionException(
                    "Could not connect to the database.");
        }
    }

    static void performOperation(Connection con)
            throws DatabaseOperationException {

        try {
            Statement stmt = con.createStatement();
            stmt.executeQuery("SELECT * FROM employees");
        } catch (Exception e) {
            throw new DatabaseOperationException(
                    "An error occurred during the database operation.");
        }
    }
}