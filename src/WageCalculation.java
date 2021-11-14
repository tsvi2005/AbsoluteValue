import java.util.Scanner;
// EXERCISE 5
public class WageCalculation {
    public static double WageSalary (int typeOfEmployee, int hourOfWork, int dailyDestination)
    {
       final int PAYMANETSENIOR = 200;
       final int PAYMANETJUNIOR = 50;
        final int PAYMANETBONUS = 250;
            double salary = 0;
       if (typeOfEmployee == 0) {
        salary = ((PAYMANETBONUS*dailyDestination)+(PAYMANETJUNIOR*hourOfWork));
        }else if (typeOfEmployee == 1) {
        salary = ((PAYMANETBONUS*dailyDestination)+(PAYMANETSENIOR*hourOfWork));
       }
        return salary;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the type of employee");
            int typeOfEmployee = scanner.nextInt();
            System.out.println("Enter the number of working hours");
            int hourOfWork = scanner.nextInt();
            System.out.println("Enter the number of days he reached the destination");
            int dailyDestination = scanner.nextInt();
             System.out.print("Your salary this month is ");
            System.out.println(WageSalary(typeOfEmployee, hourOfWork, dailyDestination));
        }
    }
}
