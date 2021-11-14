import java.util.Scanner;
// EXERCISE 7
public class SchedulingAppointmentsAtTheIRS {
    public static void  checkValue(int dayCheck , int timeFrom  , int timeTo) {
        final int TEUSDAY = 3;
        final int TEUSDAY_CLOSE = 12;
        final int TEUSDAY_OPEN = 8;
        final int OTHER_DAY_CLOSE = 17;
        final int OTHER_DAY_OPEN = 9;
        if (dayCheck == TEUSDAY) {
            if (timeFrom < TEUSDAY_OPEN || timeFrom > TEUSDAY_CLOSE) {
                System.out.println("Sorry but we are close!");
                System.out.println("On Tuesday we are open from hour " + TEUSDAY_OPEN + " to hour " + TEUSDAY_CLOSE);
            } else {
                System.out.println("The meeting was scheduled");
            }
        } else {
            if (timeFrom < OTHER_DAY_OPEN || timeFrom > OTHER_DAY_CLOSE) {
                System.out.println("Sorry but we are close!");
                System.out.println("On day " + dayCheck +" we are open from hour " + OTHER_DAY_OPEN+ " to hour " + OTHER_DAY_CLOSE);
            } else{
                System.out.println("The meeting was scheduled");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello to the IRS");
        System.out.println("Which day do you want to come? (select a day from 1 to 7) ");
        int daychoise = scanner.nextInt();
        final int SONDAY = 1;
        final int FRIDAY = 6;
        final int SATERDAY = 7;
        final int TIME_LIMT_DOWN = 0;
        final int TIME_LIMT_UP = 23;
        if (daychoise >= SONDAY && daychoise < FRIDAY){
            System.out.println("What is the earliest hour you can arrive?   (select a hour from 0 to 23)");
            int earliesHour = scanner.nextInt();
            if (earliesHour > TIME_LIMT_DOWN && earliesHour <TIME_LIMT_UP){
                System.out.println("What's the latest time you can arrive?   (select a hour from 0 to 23)");
                int latestHour = scanner.nextInt();
                if (latestHour < TIME_LIMT_DOWN && latestHour > TIME_LIMT_UP){
                    System.out.println("There is no hour like this");
                }else if ( latestHour < earliesHour){
                    System.out.println("The earliest hour can not be later than the latest hour");
                }else {
                    checkValue(daychoise , earliesHour , latestHour);
                }
            }else{
                System.out.println("There is no hour like this");
            }

        }else {
            switch (daychoise){
                case FRIDAY:
                    System.out.println("We are close!");
                    break;
                case SATERDAY:
                    System.out.println("We are close!");
                    break;
                default:
                    System.out.println("There is no day like this");
                    break;
            }
        }
    }
}