import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    double base,hight,area;
    try(Scanner input =new Scanner(System.in)){
        System.out.print("Enter base number = ");
        base=input.nextDouble();
        System.out.print("Enter hight number= ");
        hight=input.nextDouble();

        area=0.5*base*hight;
        System.out.print("Your Triangle Area "+area);


    }
  }
}
