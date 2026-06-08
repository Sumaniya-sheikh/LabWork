package week8;

import java.util.*;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class CustomException {

    static void log(String level, String msg){
        System.out.println("Log: [" + level + "] " + msg);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        String input = sc.nextLine();

        try {

          
            if (input.trim().isEmpty()) {
                throw new IllegalArgumentException("No data provided.");
            }

            String[] values = input.split(" ");

            for (String value : values) {
                try {
                    Integer.parseInt(value);
                } catch (NumberFormatException e) {
                  
                    throw new InvalidDataException("\"" + value + "\" is not a valid number.");
                }
            }

          
            System.out.println("No exception");

        }
        catch (InvalidDataException e) {
            System.out.println("Exception: InvalidDataException - " + e.getMessage());
            log("ERROR", "InvalidDataException occurred.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
            log("ERROR", "IllegalArgumentException occurred.");
        }
    }
}