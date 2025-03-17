package je25_java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    public static void main(String[] args) {
        Instanciacao();
        StringConversaoHora();
        AdicaoSubtracaoTempo();
        ComparacaoTempo();
        FormatacaoHora();
        DadosEspecificos();
    }

    /**
     * Time Now <br>
     * Hours/ Minutes/ Seconds <br>
     * Hours / Minutes
     */
    private static void Instanciacao() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalTime horaMinutoEspecifico = LocalTime.of(13,21); // 13:21
        System.out.println(horaMinutoEspecifico);

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13,21,42); // 13:21:42
        System.out.println(horaMinutoSegundoEspecifico);
    }


    /**
     * Convert String in LocalTime format
     */
    private static void StringConversaoHora() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        // Conversão
        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");
        System.out.println(horaDeUmaString);
    }


    private static void AdicaoSubtracaoTempo() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalTime hora = LocalTime.now();
        LocalTime mais30Minutos = hora.plusMinutes(30);
        LocalTime menos2Horas = hora.minusHours(2);

        System.out.println(hora);
        System.out.println(mais30Minutos);
        System.out.println(menos2Horas);
    }


    private static void ComparacaoTempo() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalTime hora = LocalTime.now();
        LocalTime menos2Horas = hora.minusHours(2);

        boolean antes = hora.isBefore(menos2Horas);  // false
        boolean depois = hora.isAfter(menos2Horas);  // true

        System.out.println(antes);
        System.out.println(depois);
    }

    /**
     * String to Time formated Hours/Minutes/Seconds
     * */
    private static void FormatacaoHora() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter); // 13:21:42
        System.out.println(horaDeUmaStringDespadronizada);

        LocalTime horaMinutoEspecifico = LocalTime.of(13,21, 42);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaformatada = horaMinutoEspecifico .format(formatter1); // 13:21:42
        System.out.println(horaformatada);
    }


    private static void DadosEspecificos() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalTime hora = LocalTime.of(13,21,42);

        System.out.println(hora.getHour());     // 13
        System.out.println(hora.getMinute());   // 21
        System.out.println(hora.getSecond());   // 42
        System.out.println(hora.getNano());     // 0
    }
}
