import java.util.*;
public class recip{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int temp=num;
        double sum=0;
        if(num<0){
            temp=-temp;
        }
        for(int i=1;i<=temp;i++){
            sum+=(1/(double)i);
        }
        if(num<0){
            sum=-sum;
        }
        System.out.println("Sum of recipocal of number upto "+num+" is: "+sum);
    }
}
