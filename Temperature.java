import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double celsius,fahrenheit;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("celsius value = ");
            celsius=input.nextDouble();

            fahrenheit = 9/5*celsius+32;
            System.out.print("Fahrenheit is "+fahrenheit);
        }
    }
}
