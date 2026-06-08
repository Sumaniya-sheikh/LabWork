import java.util.Scanner;
class sep{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter four numbers = ");
int num = sc.nextInt();



int n1= (num/1000);
System.out.println(n1);

int n2= (num/100)%100;
System.out.println(n2);
int n3= num%10;
System.out.println(n3);

}
}