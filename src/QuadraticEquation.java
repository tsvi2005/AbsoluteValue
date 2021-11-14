import java.util.Scanner;
import java.lang.Math;
// EXERCISE 4
public class QuadraticEquation {//Quadratic equation        A plan for solving a quadratic equation

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paramA = 0;
        int paramB = 0;
        int paramC = 0;
        System.out.println("A plan for solving a quadratic equation");
        System.out.println("Enter the parameter a:");
        paramA = scanner.nextInt();
        if (paramA == 0) {
            System.out.println("If parameter a=0");
            System.out.println("This is not a quadratic equation");
        }else {
            System.out.println("Enter the parameter b:");
            paramB = scanner.nextInt();
            System.out.println("Enter the parameter c:");
            paramC = scanner.nextInt();
            if (RootCalculation(paramA, paramB, paramC) == 0) {
                System.out.println("There is one result x1 = " +(-paramB) / 2);
            }else {
                if (RootCalculation(paramA, paramB, paramC) > 0) {
                    double resultOne = (((-paramB) + RootCalculation(paramA, paramB, paramC)) / 2);
                    double resultTwo = (((-paramB) - RootCalculation(paramA, paramB, paramC)) / 2);
                    System.out.println("There are two results. x1 = " + resultOne + " , x2 = " + resultTwo);
                } else {
                    System.out.println("There is no solution");
                }
            }
        }
    }
    public static double RootCalculation (int paramA, int paramB, int paramC) {
            double rootResult = Math.sqrt((paramB * paramB) - (4 * paramA * paramC));
            return rootResult;
    }
    }
