package week_7;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor();
        DataValidation validator = new DataValidation();
        AverageCalc calculator = new AverageCalc();
        DataReporting reporter = new DataReporting();

        try {
            // Step 1: Read
            List<String> data = processor.readValues("input.txt");

            // Step 2: Validate
            List<Double> validData = validator.validate(data);

            // Step 3: Calculate
            double avg = calculator.calculate(validData);

            // Step 4: Write
            reporter.write("output.txt", avg);

            System.out.println("File output.txt containing \"" + avg + "\"");

        } catch (FileNotFoundException e) {
            System.out.println("Exception: FileNotFoundException - " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Exception: IOException - " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}