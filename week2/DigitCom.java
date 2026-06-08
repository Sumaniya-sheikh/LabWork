import java.util.Scanner;
public class DigitCom {

    public static void main(String args[]) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digits ");
        int arr[] = new int[3]; 
        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && k!=i){
                        
                        System.out.println(arr[i]+""+arr[j]+""+arr[k]);
                    }
                }
            }
        }
    }
}
