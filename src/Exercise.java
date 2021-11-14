import java.util.Scanner;

public class Exercise {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        int successor = userInput + 1 ;
        System.out.println("The successor is " + successor);
    }
}
