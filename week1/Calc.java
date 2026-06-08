import java.util.*;

class Calc{


public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number = ");
	int num1 = sc.nextInt();
	System.out.println("Enter Second Number = ");
	int num2 = sc.nextInt();

	int sum,diff,prod,quo;

	sum=num1+num2;
	diff=num1-num2;
	prod =num1*num2;
	quo=num1/num2;
System.out.println("Sum = " +sum + "\nDiff = " +diff + "\nProduct = " +prod + "\nQuo = " +quo);
	if(num1>num2)
System.out.println("Max = " +num1+"\nMin = " +num2);
else
System.out.println("\nMax = " +num2 +"Min = " +num1);

}
}