package je25_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        ConvertFromDatetime_to_Others();
        ConvertFromDate_to_Datetime();
    }

    /**
     * Convert from DateTime to Date
     * Convert from DateTime to Time
     */
    private static void ConvertFromDatetime_to_Others() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalDateTime dataHora = LocalDateTime.of(2023, 1, 24, 16, 31, 27);

        // Datetime to Date - 2023-01-24
        LocalDate data = dataHora.toLocalDate();
        System.out.println(data);

        // // Datetime to Time - 16:31:27
        LocalTime hora = dataHora.toLocalTime();
        System.out.println(hora);
    }


    /**
     * Convert from Date do DateTime
     */
    private static void ConvertFromDate_to_Datetime() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        // Date to Datetime - 2025-03-16T20:00
        LocalDate localDate = LocalDate.now();
        LocalDateTime dataHora = localDate.atTime(20, 0);
        System.out.println(dataHora);

        // Hora to Datetime -  2025-03-16T20:56:33.620602400
        LocalDateTime dataHoraAtual = localDate.atTime(LocalTime.now());
        System.out.println(dataHoraAtual);

        // Hora to Date - 2025-03-16T19:17:21
        LocalTime localTime = LocalTime.of(19, 17, 21);
        dataHora = localDate.atTime(localTime);
        System.out.println(dataHora);
    }
}