package week6;
import java.util.Scanner;

class Reversal {

    String revWords(String text) {

        String[] words = text.split(" ");
        String result = "";

        
        System.out.println(words);
        for (String word : words) {
            String reversed = "";

            for (int i = word.length()- 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            result += reversed + " ";
        }
        return result;

    }
}

public class TextRev {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence = ");
        String text = sc.nextLine();

        Reversal obj = new Reversal();
//       for storing the output  
        String output = obj.revWords(text);

        System.out.println(output);
    }
}