import java.util.Scanner;
public class TestAnalysis {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter a sentence = ");
         String text = sc.nextLine();
         text = text.toLowerCase();

         System.out.println("Enter a character you want to check its occurrence = ");
         char target = sc.next().charAt(0);
         target = Character.toLowerCase(target);

         int WordCount = 0;
         int SentenceCount = 0;
         int CharacterCount = 0;

         for(int i = 0; i < text.length(); i ++){
             char ch = text.charAt(i);
             if(ch == ' '){
                 WordCount++;
             }
             if(ch == '.' || ch == '!' || ch == '?'){
                 SentenceCount++;
             }
             if (ch == target){
                 CharacterCount++;
             }
         }
         if(!text.isEmpty()){
             WordCount = WordCount + 1;
         }
         System.out.println("Number of Words = " + WordCount);
         System.out.println("Number of Sentences = " + SentenceCount);
         System.out.println("Character " + target + " occurs " + CharacterCount + " times.");
    }
}
