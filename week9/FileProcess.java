package week_10;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.File;

public class FileProcess {

    private static final Logger log =
            LogManager.getLogger(FileProcess.class);
    
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Choose option:");
        System.out.println("1. File : NullPointerException ");
        System.out.println("2. Array index out of bounds");
        System.out.println("3. String : Null pointer exception");
        
        int input = sc.nextInt();
        

        switch(input){
            
        case 1 -> { 
        try{
        //        1st Condition 
            File file = null;
            String name = file.getName();
        }
        catch(NullPointerException e){
            System.out.println("Exception: " + e);
            log.error("NullPointerException Occurred", e);
        }
    }
        case 2 ->{
            try{
 //         `` 2nd Condition 
               int arr[]= new int[5];
               System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception: " + e);
                log.error( "ArrayIndexOutOfBoundsException Occurred" , e);
            }
        }
        case 3 -> {
            try{        
    //      3rd Condition 
            String str = null;   
            System.out.println(str.length());
            }
            catch(NullPointerException e){
        System.out.println("Exception: " + e);
            log.error("NullPointerException Occurred", e);
        }
        }
        }
    }
        
       
        
    }

