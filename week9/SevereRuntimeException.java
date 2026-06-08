package week9;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SevereRuntimeException {

    private static final Logger log =
            LogManager.getLogger(SevereRuntimeException.class);

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option:");
        System.out.println("1. ArithmeticException");
        System.out.println("2. ArrayIndexOutOfBoundsException");
        System.out.println("3. NullPointerException");

        int input = sc.nextInt();

        switch(input){

            case 1 -> {
                try{
                    int result = 10/0;
                }
                catch(ArithmeticException e){
                    System.out.println("Exception: " + e);
                    log.error("ArithmeticException occurred", e);
                    System.out.println("Application terminated with error code 1.");
                    System.exit(1);
                }
            }

            case 2 -> {
                try{
                    int arr[] = new int[5];
                    System.out.println(arr[10]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception: " + e);
                    log.error("ArrayIndexOutOfBoundsException occurred", e);
                    System.out.println("Application terminated with error code 1.");
                    System.exit(1);
                }
            }

            case 3 -> {
                try{
                    String str = null;
                    System.out.println(str.length());
                }
                catch(NullPointerException e){
                    System.out.println("Exception: " + e);
                    log.error("NullPointerException occurred", e);
                    System.out.println("Application terminated with error code 1.");
                    System.exit(1);
                }
            }
        }

        sc.close();
    }
}