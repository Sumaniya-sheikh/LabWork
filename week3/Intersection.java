import java.util.Scanner;
import java.awt.Rectangle;
public class Intersection {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the Values of Rectangle 1 =  x1, y1 , width1, height1 = ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int width1 = sc.nextInt();
        int height1 = sc.nextInt();
        
        Rectangle r1 = new Rectangle(x1,y1,width1, height1); 
        
        System.out.println("Enter the Values of Rectangle 2 =  x2, y2 ,width2, height2 = ");

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int width2 = sc.nextInt();
        int height2 = sc.nextInt();
        
        Rectangle r2 = new Rectangle(x2,y2,width2, height2); 
        
           //int left = Math.max(r1.x, r2.x);
	  // int top  = Math.max(r1.y, r2.y);
	  // int right = Math.min(r1.x1+r1.w1, r2.x2+r2.w2);
	  // int bottom = Math.min(r1.y1+r1.h1, r2.y2+r2.h2);
	       

 	int left = Math.max(r1.x, r2.x);
        int top  = Math.max(r1.y, r2.y);
        int right  = Math.min(r1.x + r1.width,r2.x + r2.width);
        int bottom = Math.min( r1.y + r1.height, r2.y + r2.height);


 	if (left < right && top < bottom) { int w = right - left;int h 	= bottom - top;

           System.out.println("Intersection: (" + left + ", " +top + ", " + w + ", " + h + ")");
	 }

	 else {
            System.out.println("No Intersection");
        }
        
    }
}
