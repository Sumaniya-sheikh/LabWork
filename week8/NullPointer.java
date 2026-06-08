package week8;

import java.util.Scanner;

public class NullPointer {

    public static void main(String args[]) {
      

    String str = null;
    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter version -> 1, 2, 3 = ");
        int version = sc.nextInt();

    switch(version){
       
        case 1 -> {
            //        Version A
            try {
                System.out.println(str.length());
            }
            catch(NullPointerException e){
                System.out.println("Exception : java.lang.NullPointerException");
            }       }
          
        case 2 -> {
            //        Version B
            if(str!=null){
                System.out.println(str.length());
            }
            else
            {
                System.out.println("No Output : No Exception");
                
            }       }
        case 3 -> {
            //        Version C
            try{
                System.out.println(str.length());
            }
            catch(NullPointerException e){
                
//        prints only message
System.out.println("Exception" + e.getMessage());

//         prints full message with exception class
System.out.println("Exception" + e);
            }       }

    }
}
}
