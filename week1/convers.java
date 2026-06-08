import java.util.*;
class convers{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array = ");

	int size = sc.nextInt();
	double f[]= new double[size] ;
	double c[] = new double[size] ;

System.out.println("Enter the temperature of fahrenheit = ");

	for(int i=0; i<size; i++){

	f[i]= sc.nextDouble();
	c[i]=(f[i]-32)/1.8;
}


System.out.println("S.no. \t"+"fahrenheit"+"     \t     "+"celcius");

	for(int i=0; i<size; i++){

	System.out.println((i+1)+" \t "+f[i] + "     \t     " +c[i]);
}
}
}