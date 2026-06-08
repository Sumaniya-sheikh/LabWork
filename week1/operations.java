import java.util.Scanner;
class operations{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number = ");
double num = sc.nextDouble();

double numRound = Math.round(num);
double numCeil = Math.ceil(num);
double numFloor = Math.floor(num);

int numInteger = (int)num;

System.out.println("numRound = "+numRound);
System.out.println("numCeil = "+numCeil);
System.out.println("numFloor= "+numFloor);
System.out.println("numInteger = "+numInteger);

}
}

