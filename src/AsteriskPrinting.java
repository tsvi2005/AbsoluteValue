import java.util.Scanner;
// EXERCISE 8
public class AsteriskPrinting {
    public static void main(String[] args) {
        int paramer = getUserChoice(); // printAsterisk(getUserChoice()); אפשרי לכתוב כך
          printAsterisk(paramer);
    }
    public static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int userChoice;
    do {
        System.out.println("Choose a number from 5-20");
        userChoice = scanner.nextInt();
        if ((userChoice < 5) || (userChoice > 20)){
            System.out.println("The number you selected is out of range");
                    System.out.println("Try again");
        }
    } while ( (userChoice < 5) || (userChoice > 20));
    return userChoice;
    }
    public static void printAsterisk (int numberOfAsterisk){
        for (int i = 0; i < (numberOfAsterisk); i++) {
            for (int k = 0 ; k < (i+1) ; k++){
            System.out.print("*");
            }
            System.out.println();
        }
        }

}
