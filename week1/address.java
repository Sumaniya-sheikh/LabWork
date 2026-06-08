import java.util.Scanner;

    class address{
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

//System.out.println("Enter the Address of a student 1 = ");
    for(int i=0 ; i<5; i++){
    System.out.println("Enter the Address of "+(i+1)+" student = ");
    String Address = sc.nextLine();
    System.out.println("Address is = " +Address);
}
}
}