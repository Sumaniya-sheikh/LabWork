import java.util.Scanner;
class Floyd1{
public static void main(String [] args){

Scanner sc = new Scanner (System.in);
System.out.println("Enter the value = ");
int num = sc.nextInt();

for(int i=1; i<=num; i++){

for(int j=0; j<i;j++)
{
if((i+j)%2==0){
System.out.print("0");
}
else
System.out.print("1");

}
System.out.println(" ");
}

}
}