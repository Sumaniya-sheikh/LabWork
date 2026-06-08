package week_10;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/*Note:
Log4j configuration is done using log4j2.xml file placed in resources folder.
Logs are printed on console and stored in logs/app.log file.
   */ 
public class LogFrameIntegration {   
     
    private static final Logger log =
            LogManager.getLogger(LogFrameIntegration.class);
    
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the exception number u want to check = ");
  
      System.out.println("1. /0 : ArithmeticException ");
      System.out.println("2. Array index out of bounds");
      System.out.println("3. String : Null pointer exception");
      int num = sc.nextInt();
      
       switch(num){
           case 1 ->{
           try{
            int result = 10/0;
//            System.out.println("");
       }
             catch(ArithmeticException e){
            System.out.println("Exception : "+ e);
          log.error("ArithmeticException occurred " , e);

            }
           }
           case 2 ->{
           try{
            int arr[]= new int[5] ;
            System.out.println(arr[10]);
       }
             catch(IndexOutOfBoundsException e){
            System.out.println("Exception : "+ e);
          log.error("IndexOutOfBoundsException " , e);

            }
           }
           case 3 ->{
           try{
           String str = null ;
            System.out.println(str.length());
       }
             catch(NullPointerException e){
            System.out.println("Exception : "+ e);
           log.error("NullPointerException" , e);
            }
           }
       }
}

    

}
