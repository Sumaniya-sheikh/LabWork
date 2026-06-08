package week_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinallyBlock {

    private static final Logger logger =
            LogManager.getLogger(FinallyBlock.class);

    public static void main(String[] args) {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "system");

            System.out.println("Connection successful");

            Statement st = con.createStatement();
            st.executeQuery("SELECT * FROM dummy_table");

        } catch (Exception e) {

            System.out.println(
            "Exception: DatabaseConnectionException - Could not connect to the database.");

            logger.error("DatabaseConnectionException occurred.");
            System.out.println("Log: [ERROR] DatabaseConnectionException occurred.");

        } finally {

            try {
                if (con != null) con.close();
                System.out.println("Connection closed");

                logger.info("Database connection closed successfully.");
                System.out.println(
                "Log: [INFO] Database connection closed successfully.");

            } catch (Exception e) {}
        }
    }
}