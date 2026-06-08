package week_7;

import java.util.*;

public class DataValidation {

    public List<Double> validate(List<String> data) throws InvalidDataException {

        List<Double> validData = new ArrayList<>();

        for (String value : data) {
            try {
                double num = Double.parseDouble(value);
                validData.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Exception: InvalidDataException - \"" + value + "\" is not a valid number.");
            }
        }

        return validData;
    }
}