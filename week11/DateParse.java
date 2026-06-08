package week11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class DateParseException extends Exception {
    public DateParseException(String message) {
        super(message);
    }
}

public class DateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateStr = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateStr);
            System.out.println("Parsed Date: " + date);

        } catch (ParseException e) {
            System.out.println("Exception: DateParseException - Unparseable date: \"" + dateStr + "\"");

        } finally {
            System.out.println("Formatter closed");
        }

        sc.close();
    }
}