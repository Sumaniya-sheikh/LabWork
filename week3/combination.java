import java.util.Scanner;
public class combination {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[]= new int[3];

 	System.out.println("enter digits = ");

        for(int i=0; i<3; i++){
            arr[i] =sc.nextInt();
           }
 	for(int a=0; a<3; a++){
            for(int j=0; j<3; j++){
		 for(int k=0; k<3; k++){
 			if(a!=j && j!=k && a!=k){
        			System.out.println(arr[a]+""+ arr[j]+""+arr[k]);
          
                                }
                            }
                        }
                     }
    }
}
