package week_10;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class GracefulTermination {
  
    private static final Logger log =
            LogManager.getLogger(GracefulTermination.class);
    
    public static void main(String args[]) {
      
         try{
             
            int result = 10/0;
//           
       }
             catch(ArithmeticException e){
                 
            System.out.println("Exception : "+ e);
          log.error("ArithmeticException occurred. \n Application terminated with error code 1" );
         
/*          for termination
          0 for success
          1 for error
          */
          System.exit(1);
    }
         System.out.println("Program ended normally");
}
}