package week7;

import java.io.*;
import java.util.*;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class DataProcessor {

    public static void main(String[] args) {

        try {

            File file = new File("input.txt");

            if (!file.exists()) {
                throw new FileNotFoundException("The file input.txt does not exist.");
            }

            Scanner sc = new Scanner(file);

            double sum = 0;
            int count = 0;

            while (sc.hasNext()) {

                String value = sc.next();

                try {
                    double num = Double.parseDouble(value);
                    sum += num;
                    count++;
                } 
                catch (NumberFormatException e) {
                    throw new InvalidDataException("\"" + value + "\" is not a valid number.");
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("No numeric values found in the file");
            }

            double avg = sum / count;

            FileWriter writer = new FileWriter("output.txt");
            writer.write(String.valueOf(avg));
            writer.close();

        } 
        catch (InvalidDataException e) {
            System.out.println("Exception: InvalidDataException - " + e.getMessage());
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception: FileNotFoundException - " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}