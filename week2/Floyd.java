import java.util.Scanner;
class Floyd{
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int num= sc.nextInt();

        int a=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        int b=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b%2+" ");
                b++;
            }
            System.out.println();
            if(i%2==1){
                b=0;
            }else{
                b=1;
            }
        }
    }

}