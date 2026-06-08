package week_7;

import java.io.*;
import java.util.*;

public class DataProcessor {

    public List<String> readValues(String fileName) throws FileNotFoundException {

        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("The file " + fileName + " does not exist.");
        }

        Scanner sc = new Scanner(file);
        List<String> data = new ArrayList<>();

        while (sc.hasNext()) {
            data.add(sc.next());
        }

        sc.close();

        if (data.isEmpty()) {
            throw new IllegalArgumentException("No numeric values found in the file.");
        }

        return data;
    }
}