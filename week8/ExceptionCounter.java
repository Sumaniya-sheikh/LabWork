package week8;

import java.io.File;
import java.util.Scanner;   

public class ExceptionCounter {

    public static void main(String[] args) throws Exception {

        File file = new File("E:\\Sem2\\week8\\week8\\src\\week8\\TestFile.java");
        Scanner sc = new Scanner(file);
        int count = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

//            // Ignore full-line comments
            if (line.trim().startsWith("//")) {
                continue;
            }

            // Count occurrences
            count += countOccurrences(line, "throw new");
            count += countOccurrences(line, "catch(");
            count += countOccurrences(line, "catch (");
        }

        System.out.println("Total exceptions: " + count);
    }

    // Function to count occurrences of a word
    static int countOccurrences(String line, String word) {
        int count = 0;

        while (line.contains(word)) {
            count++;
            line = line.replace(word, "");
        }

        return count;
    }
}