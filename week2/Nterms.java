import java.util.Scanner;
class Nterms{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a the number of terms = ");
int num = sc.nextInt();

int sum=0;
for(int i=1; i<=num; i++){

if(i%2==0){
sum= sum + i;

}

}
System.out.println("Sum of Even numbers = "+ sum);


}

}