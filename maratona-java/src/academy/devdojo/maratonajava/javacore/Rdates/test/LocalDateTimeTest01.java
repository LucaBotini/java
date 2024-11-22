package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMinute());
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 10);
        LocalTime time = LocalTime.of(21, 42, 9);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(date + "\n" + time);
        date.atTime(time);
        System.out.println(localDateTime1);
    }
}
