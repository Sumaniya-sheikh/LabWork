package week_7;

import java.util.*;

public class AverageCalc {

    public double calculate(List<Double> data) {

        if (data.isEmpty()) {
            throw new IllegalArgumentException("No valid numeric values to calculate average.");
        }

        double sum = 0;

        for (double num : data) {
            sum += num;
        }

        return sum / data.size();
    }
}