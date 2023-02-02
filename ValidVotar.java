import java.util.Scanner;

public class ValidVotar {
    public static void main(String[] args) {
        int age;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter Your Age");
            age=input.nextInt();

            if(age>=18){
                System.out.println("valid voter");
            }
            else{
                System.out.println("Invalid voter");
            }
        }
    }
}
