import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter a character");
            ch= input.next().charAt(0);

            if(ch=='a'){
                System.out.println("vowel");
            }
            else if(ch=='e'){
                System.out.println("vowel");
            }
            else if(ch=='i'){
                System.out.println("vowel");
            }
            else if(ch=='o'){
                System.out.println("vowel");
            }
            else if(ch=='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("consonant");
            }
        }
    }
}
