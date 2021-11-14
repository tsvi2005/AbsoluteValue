import java.util.Scanner;

public class OpenSafari {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello dear visitor\n" +
                "Write the time you want to arrive");
        int userInput = scanner.nextInt();
        if (userInput >= 10 && userInput < 20) {
            System.out.println("Excellent\n" +
                    "You have another " +(20-userInput) + "hours to enjoy the safari");
        } else {
            System.out.println("Sorry the safari is closed");
        }
    }
}
