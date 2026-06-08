package week6;
import java.util.Scanner;
import java.util.Arrays;

public class LexicoSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.print("Enter third string: ");
        String s3 = sc.nextLine();

        String[] arr = {s1, s2, s3};
        Arrays.sort(arr);

        System.out.println("Sorted Strings: " + arr[0] + ", "+ arr[1] + ", "+ arr[2]);
    }
}