import java.util.Scanner;

class arithmaticOperator{
    public static void main(String[] args) {
        
        try( Scanner Input=new Scanner(System.in)){

            int num1, num2, result;
            System.out.print("Enter two number");
            num1=Input.nextInt();
            num2=Input.nextInt();
        
        result=num1+num2;
        System.out.println("Sum= "+result);
        result=num1-num2;
        System.out.println("Sub= "+result);
        result=num1*num2;
        System.out.println("Mul= "+result);
        result=num1/num2;
        System.out.println("Div= "+result);
        result=num1%num2;
        System.out.println("MOd= "+result);
    }
    }
}