import java.util.Scanner;
// EXERCISE 1
public class AbsoluteValue {

    public static void main(String[] args) {// exercise 1 print the absolute value
        Scanner scanner = new Scanner(System.in);
        int absolute=(-1);
        int zero = 0;
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        if (userInput < zero) {
            absolute = userInput * absolute;
        }else {
            absolute = userInput;
        }
        System.out.println("The absolute value is:" + absolute);
    }










}

