package week_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomOperationException {

    public static void main(String[] args) {

        Connection con = null;

        try {

            con = connectToDatabase(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "system");

            performOperation(con);

            System.out.println("Operation successful");

        } catch (DatabaseConnectionException e) {

            System.out.println(
            "Exception: DatabaseConnectionException - " + e.getMessage());

        } catch (DatabaseOperationException e) {

            System.out.println(
            "Exception: DatabaseOperationException - " + e.getMessage());

        } finally {

            try {
                if (con != null) con.close();
                System.out.println("Connection closed");
            } catch (Exception e) {}
        }
    }

    static Connection connectToDatabase(String url,String u,String p)
            throws DatabaseConnectionException {

        try {
            return DriverManager.getConnection(url,u,p);
        } catch (Exception e) {
            throw new DatabaseConnectionException(
                    "Could not connect to the database.");
        }
    }

    static void performOperation(Connection con)
            throws DatabaseOperationException {

        try {
            Statement st = con.createStatement();
            st.executeQuery("SELECT * FROM employees");
        } catch (Exception e) {
            throw new DatabaseOperationException(
            "An error occurred during the database operation.");
        }
    }
}