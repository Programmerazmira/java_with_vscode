import java.util.Scanner;

public class assingmentOperator {
    public static void main(String[] args) {
        int x,y;
        try(Scanner input=new Scanner(System.in)){

            System.out.print("Enter input= ");
            x=input.nextInt();
            System.out.print("Enter input= ");
            y=input.nextInt();

            x+=y;
            System.out.println("x= "+x);
            x-=y;
            System.out.println("x= "+x);
            x*=y;
            System.out.println("x= "+x);
            x/=y;
            System.out.println("x= "+x);
            x%=y;
            System.out.println("x= "+x);


        }
    }
}
