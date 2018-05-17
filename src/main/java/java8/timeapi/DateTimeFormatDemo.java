package java8.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse("05/17/2018",dateTimeFormatter);
        System.out.println("Parsed date is "+localDate);

        DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("MMMM dd yyyy hh':'mm a");
        LocalDateTime dateTime = LocalDateTime.parse("May 17 2018 09:29 AM",dateTimeformatter);
        System.out.println("Parsed datetime is "+ dateTime);
    }
}
