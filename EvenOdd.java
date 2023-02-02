import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
            try(Scanner input =new Scanner(System.in)){
            System.out.print("Enter A Number ");
            num= input.nextInt();

            if(num%2==0){
                System.out.println("This is a Even Number");
            }
            else{
                System.out.println("This is a Odd Number");
            }
        };
    }
}
