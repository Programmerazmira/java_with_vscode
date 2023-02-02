import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        int num;
        try(Scanner input= new Scanner(System.in)){ 
            System.out.println("Enter a num");
            num=input.nextInt();

            if(num>0){
                System.out.println("Positive");
            }
            else if(num<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Equal To Zero");
            }
        }
    }
}
