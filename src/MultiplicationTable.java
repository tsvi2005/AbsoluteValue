import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.println("Start");
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println();
            for (int j = 1; j <= maxNumber; j++) {
                System.out.print((i * j));
                if (j < 10)
                    System.out.print(" , ");
            }
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of organs we will represent in the Fibonacci series:");
        int userInput = scanner.nextInt();
        int fibonacci = 0;
        int helpFibonacci = 1;
        int numberFiboPrint = 0;
        if (userInput == 0) {
            System.out.println("There are no numbers in the series");
        } else {
            for (int h = 0; h < userInput; h++) {
                System.out.print(numberFiboPrint);
                fibonacci = helpFibonacci;
                helpFibonacci = numberFiboPrint;
                numberFiboPrint = (fibonacci + helpFibonacci);
                if (h < (userInput - 1))
                    System.out.print(" , ");
            }
        }
        System.out.println();
        //Select a number to calculate factorial
        System.out.println("Select a number to calculate factorial:");
        int userInput2 = scanner.nextInt();
        int multiplication = 1;
        if (userInput2 == 0) {
            System.out.println("The mutliplication is : 0");
        } else {
            for (int i = 1; i <= userInput2; i++) {
                multiplication = (multiplication * i);
            }
            System.out.print("The mutliplication is : " + multiplication);
        }
    }
}


