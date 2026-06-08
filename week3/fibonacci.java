import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
       System.out.println("Enter the terms = ");
         int m = sc.nextInt(); 
	 int first =0 , second=1;

int i=0;
         do{    
	     int sum=0;                     
             System.out.println(first);
  		sum = first+ second;
             first = second;
           
             second = sum;
       i++;      
            }while(i<m);
         
    }
}