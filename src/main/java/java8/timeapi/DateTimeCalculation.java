package java8.timeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeCalculation {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is "+localDate);
        System.out.println("Today plus 7 days "+localDate.plusDays(7));
        System.out.println("Today plus 2 months "+localDate.plusMonths(2));
        System.out.println("Today plus 2 weeks "+localDate.plusWeeks(2));
        System.out.println("Today plus 3 years "+localDate.plusYears(3));
        System.out.println("Today minus 3 days "+localDate.minusDays(3));
        System.out.println("Today minus 1 month "+localDate.minusMonths(1));
        System.out.println("Today minus 2 weeks "+localDate.minusWeeks(2));
        System.out.println("Today minus 1 year "+localDate.minusYears(1));

        LocalTime time = LocalTime.now();
        System.out.println("\nCurrent time = " + time);
        System.out.println("Current Time +  2 hours = " + time.plusHours(2));
        System.out.println("Current Time + 15 mins = " + time.plusMinutes(15));
    }
}
