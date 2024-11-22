package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class nextDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        // dayofweek tem os dias da semana;
        // DayOfWeek.of(a partir desse dia);
        // temporal.get();
        // ChronoField.DAY_OF_WEEK para pegar o dia em int da semana;
        // int addDays mostra quantos dias vai ser adicionado;
        // switch descobrindo qual dia é hoje e adicionando certos dias para bater com o dia útil;
        // return temporal.plus(addDays, ChronoUnit,DAYS);
        // LocalDateTime.now().withDayOfMonth(20).with(new nextDay());
        // localdatetime.now() pega o horario de agora;
        // .withDayOfMonth(*) coloca o dia no parametro;
        //.with(new nextDay() chama um objeto de classe que tem as condições para cada dia.

        int addDays;
        switch (dayOfWeek) {
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            case THURSDAY:
                addDays = 4;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);

    }
}


public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDateTime.now().withDayOfMonth(20).with(new nextDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
