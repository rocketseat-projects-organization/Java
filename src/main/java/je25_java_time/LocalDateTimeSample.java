package je25_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        Instanciacao();
        Comparacao();
        Formatacao();
        Manipulacao();
    }

    private static void Instanciacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        // 2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);
        System.out.println(dataHora);

        // 2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023, 6, 25, 16, 25, 33);
        System.out.println(dataHora);
    }


    private static void Comparacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalDateTime dataHora1 = LocalDateTime.of(2023, 6, 25, 16, 25);
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 6, 25, 16, 25, 33);

        // Comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora1.equals(dataHora2); //false
        System.out.println(dataHoraIgual);

        // Comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth() == dataHora2.getDayOfMonth(); //true
        System.out.println(dataHoraDigitoIgual);
    }


    private static void Formatacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00
    }


    private static void Manipulacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);
        LocalDateTime proximoMes = dataHora.plusMonths(1);
        System.out.println(proximoMes);                       // 2023-07-25T16:25

        LocalDateTime dataHoraComMenos15Minutos = dataHora.minusMinutes(15);
        System.out.println(dataHoraComMenos15Minutos);        // 2023-06-25T16:10

        LocalDateTime dataHoraDefinindoSegundoZero = dataHora.withSecond(33);
        System.out.println(dataHoraDefinindoSegundoZero);     // 2023-06-25T16:25:33
    }
}
