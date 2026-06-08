import java.util.Scanner;
public class Separator {

    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-Digit number = ");
        
            int num = sc.nextInt();
       
            int arr[]= new int[4];
       
        for(int i=3; i>=0; i--){  
            arr[i] = num%10;
            num = num / 10;                    
        }
        for(int i =0; i<4; i++)
            System.out.println(arr[i]);
    }
}
