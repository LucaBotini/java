package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest02 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime now = LocalTime.now();
        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
