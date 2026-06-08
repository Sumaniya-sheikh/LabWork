package week8;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

//class InvalidException extends Exception{
//    public InvalidException(String message){
//         super(message);
//    }
//   
//}


public class  TestFile {

    public static void main(String args[]) {
       
        try{
            File file = new File("data.txt");
            
            if(!file.exists()){
                throw new FileNotFoundException("The file data.txt does not exist ");
                
            }
//            The scanner reads them one by one like a pointer moving through the file (input file data.txt)
//            100 → 200 → abc → 300 → end of file
            Scanner sc = new Scanner(file);
//            validValues = [100.0, 200.0, 300.0];
            List<Double> validValues = new ArrayList<>();
            
            
//hasNext() → true
//next() → read next value
            while(sc.hasNext()){
                String value = sc.next();
             
                      /*  catch(NumberFormatException e){
               catch(NumberFormatException e){*/

              try{
                 double num = Double.parseDouble(value);
                  validValues.add(num);
                  
              }  
             catch(NumberFormatException e){
                 System.out.println("Exception : InvalidDataException "+ value + " is not a valid number ");
                 
                 
             }
            }
            System.out.println("Valid values: " + validValues);
        }
        
        catch(FileNotFoundException e){
             System.out.println("Exception: FileNotFoundException  " + e.getMessage());
        }
    }

   
    
}
