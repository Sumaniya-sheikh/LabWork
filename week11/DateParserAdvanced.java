package week11;
 import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Custom Exception
/*class DateParseException extends Exception {
    public DateParseException(String message) {
        super(message);
    }
}*/

public class DateParserAdvanced {

    public static Date parseDate(String dateStr) throws DateParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new DateParseException("Unparseable date: \"" + dateStr + "\"");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateStr = sc.nextLine();

        try {
            Date date = parseDate(dateStr);
            System.out.println("Parsed Date: " + date);

        } catch (DateParseException e) {
            System.out.println("Exception: DateParseException - " + e.getMessage());

            // Error log
            System.out.println("Log: [ERROR] DateParseException occurred.");

        } finally {
            // Always runs
            System.out.println("Formatter closed");
            System.out.println("Log: [INFO] DateFormat object closed successfully.");
        }

        sc.close();
    }
}