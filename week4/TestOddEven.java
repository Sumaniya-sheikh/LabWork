
import java.util.Scanner;

class EvenOdd{
    private int even = 0;
    private int odd = 0;
    public void checkEvenOdd(int num){
        if(num%2==0){
            even++;
        }else{
            odd++;
        }
    }
    public int totalEven(){
        return even;
    }
    public int totalOdd(){
        return odd;
    }

}
public class TestOddEven {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many number student will enter: ");
        int size = sc.nextInt();
        EvenOdd oe = new EvenOdd();
        for(int i=0;i<size;i++){
            System.out.print("Enter num "+(i+1)+": ");
            int num = sc.nextInt();
            oe.checkEvenOdd(num);
        }
        System.out.println("Total evens are: "+oe.totalEven());
        System.out.println("Total odds are: "+oe.totalOdd());
        sc.close();
    }

    }

