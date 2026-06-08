import java.util.Scanner;
public class Fiboncci {
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
         
      
         do{
                  int first =0 , second=1, sum=0;
             System.out.println(first);
             first = second;
             sum = first+ second;
             second = sum;
             
            }while(num>0);
         
    }
}
