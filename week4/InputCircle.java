import java.util.Scanner;

class Circle{
final static double PI = 3.14;
    
    void area(int r){
    double Area = PI* r*r;
    System.out.println("Area pf Circle = "+ Area);
    }
    
    void perimeter(int r){
    double Peri = 2* PI* r;
    System.out.println("Perimeter of Circle = "+ Peri);
    }
    
    void distance(int r, int x, int y, int h, int c ){
        //int dist = ((x- h)*(x- h) + (y- c) * (y- c));
    
        double dist = Math.sqrt((x- h)*(x- h) + (y- c) * (y- c));
        if(dist<=r){
            System.out.println("Points = "+ "(" + x + "," + y +")"+ " are inside the cirlce ");
        }
        else
            System.out.println("Points = "+ "(" + x + "," + y +")" + " are outside of the cirlce");
    }
   
}


public class InputCircle {
    public static void main(String args[]) {
       Circle obj = new Circle();
       Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Radius of the Circle");
          int r = sc.nextInt();
       
    //    where x and y are point (Distance from the radius)
          System.out.println("Enter the Center Points of the circle = ");
          int h = sc.nextInt();
          int c = sc.nextInt();
          System.out.println("Circle = "+ "(" + h + "," + c +")");

    //    where x and y are point (Distance from the radius)
          System.out.println("Enter the Points of the circle = ");
          int x = sc.nextInt();
          int y= sc.nextInt();
          System.out.println("Points = "+ "(" + x + "," + y +")");
          
          
          obj.area(r);
          obj.perimeter(r);
          obj.distance(r,x,y,h,c);
         
    
    }
}
