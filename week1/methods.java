import java.util.Scanner;

class methods{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number = ");
int num  = sc.nextInt();
int AbsoluteValue = Math.abs(num);
double SquareRoot = (int) Math.sqrt(num);
int Power = (int)Math.pow(num,2);

double Sin = (double) Math.sin(num);
double Cosine =(double) Math.cos(num);

System.out.println("AbsoluteValue = " +AbsoluteValue);
System.out.println("SquareRoot ="+SquareRoot);
System.out.println("Power ="+Power);
System.out.println("Sin ="+Sin);
System.out.println("Cosin ="+Cosine);


}
}