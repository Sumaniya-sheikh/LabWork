package week8;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

// Custom Exception
class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String msg) {
        super(msg);
    }
}

public class DatabaseApp {

    // Log method
    static void log(String level, String msg){
        System.out.println("Log: [" + level + "] " + msg);
    }

    // Dummy connection class (since no real DB)
    static class DummyConnection implements AutoCloseable {

        boolean valid;

        DummyConnection(boolean valid) throws DatabaseConnectionException {
            if (!valid) {
                throw new DatabaseConnectionException("Could not connect to the database.");
            }
            this.valid = true;
            System.out.println("Connection successful");
        }

        void performOperation(boolean fail) throws SQLException {
            if (fail) {
                throw new SQLException("An error occurred during the database operation.");
            }
        }

        @Override
        public void close() {
            System.out.println("Connection closed");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option:");
        System.out.println("1. Valid connection");
        System.out.println("2. Invalid connection");
        System.out.println("3. Operation error");

        int choice = sc.nextInt();

        try {
            switch (choice) {

                case 1 -> {
                    try (DummyConnection con = new DummyConnection(true)) {
                        // no error
                    }
                }

                case 2 -> {
                    try (DummyConnection con = new DummyConnection(false)) {
                    }
                }

                case 3 -> {
                    try (DummyConnection con = new DummyConnection(true)) {
                        con.performOperation(true);
                    }
                }

                default -> System.out.println("Invalid choice");
            }

        }
        catch (DatabaseConnectionException e) {
            System.out.println("Exception: DatabaseConnectionException - " + e.getMessage());
            log("ERROR", "DatabaseConnectionException occurred.");
        }
        catch (SQLException e) {
            System.out.println("Exception: SQLException - " + e.getMessage());
            log("ERROR", "SQLException occurred.");
        }
    }
}