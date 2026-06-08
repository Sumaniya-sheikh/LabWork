import java.util.*;
class count{

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		if(size<0){
			System.out.println("size cant be negative.");
		}else{
		int arr[] =new int[size];
		
		System.out.println("Enter numbers: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int even=0,odd=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}

		System.out.println("Number of Even is: "+even);
		System.out.println("Number of Odd is: "+odd);
	}
}


}