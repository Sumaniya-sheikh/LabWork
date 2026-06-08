package week_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckedExceptionDB {

    public static void main(String[] args) {

        Connection con = null;

        try {

            Class.forName("org.sqlite.JDBC");

            con = DriverManager.getConnection("jdbc:sqlite:sample.db");

            performOperation(con);

            System.out.println("Operation successful");

        } catch (DatabaseOperationException e) {

            System.out.println(
            "Exception: DatabaseOperationException - " + e.getMessage());

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally {

            try {
                if (con != null) con.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {}
        }
    }

    static void performOperation(Connection con)
        throws DatabaseOperationException {

    try {
        Statement st = con.createStatement();

        st.execute("CREATE TABLE IF NOT EXISTS employees(id INT, name TEXT)");
        st.execute("INSERT INTO employees VALUES(1,'Ali')");

        st.executeQuery("SELECT * FROM employees");

    } catch (SQLException e) {
        throw new DatabaseOperationException(
        "An error occurred during the database operation.");
    }
}
}