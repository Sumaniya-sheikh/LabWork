package week8;

import java.util.Scanner;

public class LoggingFrame {

    // Logging function (simulating Log4j)
    static void log(String level, String msg){
        System.out.println("Log: [" + level + "] " + msg);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option:");
        System.out.println("1. Divide by zero");
        System.out.println("2. Array index out of bounds");
        System.out.println("3. Null pointer");

        int choice = sc.nextInt();

        try {

            switch(choice){

                case 1:
                    int result = 10 / 0;
                    System.out.println(result);
                    break;

                case 2:
                    int arr[] = new int[5];
                    System.out.println(arr[10]);
                    break;

                case 3:
                    String str = null;
                    System.out.println(str.length());
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
        catch(ArithmeticException e){
            System.out.println("Exception: " + e);
            log("ERROR", "ArithmeticException occurred.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
            log("ERROR", "ArrayIndexOutOfBoundsException occurred.");
        }
        catch(NullPointerException e){
            System.out.println("Exception: " + e);
            log("ERROR", "NullPointerException occurred.");
        }
    }
}