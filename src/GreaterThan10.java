import java.util.Scanner;

public class GreaterThan10 {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();
            if (userInput > 10) {
                System.out.println("The number" + userInput + " is greater than 10");
            } else {
                System.out.println("The number" + userInput + " is not greater than 10");
            }
        }
}
    //The number is greater than 10