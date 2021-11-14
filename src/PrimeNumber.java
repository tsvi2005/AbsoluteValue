import java.util.Scanner;
// EXERCISE 9
public class PrimeNumber {
    public static void main(String[] args) {
        int userChoice = getUserChoice();
        for (int i = 2; i <= userChoice ; i++) {// המספר 2 הוא ראשוני ואתה בתרגיל דילגת על מספר 2. לכן אם צריך מהמספר 3 אני משנה את הפור לi=3
            boolean checkPrime = checkPrimeNumber(i);
            if (checkPrime == true) {
                System.out.print(i + " , ");
            }
        }
        }

    public static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            System.out.println("Choose a positive number ");
            userChoice = scanner.nextInt();
            if (userChoice < 1){
                System.out.println("The number you selected is not positive");
                        System.out.println("Try again");
            }
        } while (userChoice < 1);
        return userChoice;
    }
    public static Boolean numberDivision (int numberOne , int numberTwo){
        if (numberOne % numberTwo == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static Boolean checkPrimeNumber (int numberTested) {
        for (int i = 2 ; i < numberTested ; i++)
            if (numberDivision(numberTested, i)){
               return false ;
            }
        return true;
        }
        }