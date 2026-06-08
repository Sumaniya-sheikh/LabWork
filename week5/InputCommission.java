import java.util.Scanner;

class Commission{
    void calc(int sales){
        if(sales<=500){
            float comm = (sales*2)/100;
            System.out.println("Commisson = "+ comm);
        }
        else if(sales>500 && sales < 5000){
             float comm = (sales*5)/100;
              System.out.println("Commisson = "+ comm);
        }
        else if(sales>=5000){
             float comm = (sales*8)/100;
              System.out.println("Commisson = "+ comm);
        }
    }
}

public class InputCommission {

    public static void main(String args[]) {
        Commission obj = new Commission();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sales = ");
        int sales = sc.nextInt();
        obj.calc(sales);
        
    
    }
}