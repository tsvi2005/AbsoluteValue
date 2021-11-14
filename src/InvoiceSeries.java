import java.util.Scanner;
// EXERCISE 6
public class InvoiceSeries {
    public static void main(String[] args){
        int amoutOfOrgans  ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first organ:");
        int firstOrgan = scanner.nextInt();
        System.out.println("Enter the difference between the organs:");
        int differerence = scanner.nextInt();
        do {
            System.out.println("Enter the amount of organs:");
            amoutOfOrgans = scanner.nextInt();
            if (amoutOfOrgans <= 0){
                System.out.println("There is no series with 0 organs or a negative number of organs" +
                        "Try agian");
            }
        } while ( amoutOfOrgans <= 0);
        System.out.println(printSeries(firstOrgan,differerence,amoutOfOrgans));
    }
    public static int printSeries (int firstOrgan, int differerence , int amoutOfOrgans){
        int [] array = new int[amoutOfOrgans];
        int organ = firstOrgan;
        for (int i = 0; i < (array.length - 1); i++) {
            System.out.print(organ + " ,");
            organ = organ + differerence ;
        }
        return organ;
    }
}