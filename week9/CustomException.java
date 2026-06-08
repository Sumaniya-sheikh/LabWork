package week9;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

class InvalidDataException extends Exception{
    InvalidDataException(String msg){
        super(msg);
        
    }
}
public class CustomException {
    private static final Logger log =
            LogManager.getLogger(CustomException.class);
    
    public static void main(String args[]) {
       
        String data ="10.5 20 30 ";
//        String data ="10 avc 20 30 ";
       
        try{
            if(data.isEmpty()){
                throw new IllegalArgumentException("No data found");
            }
            String values[] = data.trim().split(" ");
            
            for(String val : values){
               try{
                Double.valueOf(val);
//                   Integer.valueOf(val.trim());
              
                  }
                catch(NumberFormatException e){
             throw new InvalidDataException("\"" + val + "\"" + " is not a valid number ");
            }
            }
            System.out.println("No Exception");
           } 
        catch(InvalidDataException e){
               System.out.println("Exception : " + e.getClass().getSimpleName() + " - " +e.getMessage());
            log.error("InvalidDataException occurred");
        }   
               
     
    }
}
