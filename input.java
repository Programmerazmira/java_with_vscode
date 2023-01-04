import java.util.Scanner;

public class input {
  public static void main(String[] args) {
     try (Scanner Input = new Scanner(System.in)) {
        int number;
   
        System.out.print("Enter a number ");
        number=Input.nextInt();
        System.out.println("the number is "+number);

        String name;
        System.out.print("Please Give ME Your Name :");
        name=Input.next();
        System.out.print("Your name is "+name);
    }

  }
        

    }

