import java.util.Scanner;
// EXERCISE 2
public class SumOfTwoNumbers {
    public static String checkSum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++){
            sum += i;
        }
        String str = new String();
        str = ("The sum of the numbers is odd");
        if (sum%2 == 0) {
            str = ("The sum of the numbers is even");
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println("number one is:");
        firstNumber = scanner.nextInt();
        System.out.println("number two is:");
        secondNumber =scanner.nextInt();
        String str = checkSum(firstNumber, secondNumber);
        System.out.println(str);
    }
}

