package je25_java_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSample {
    public static void main(String[] args) {
        Instanciacao();
        StringConversaoData();
        AdicaoSubtracaoDatas();
        ComparacaoDatas();
        Formatacao();
        TiposDeDatas();
        LocalizacaoMeridiano();
        DadosEspecificos();
    }


    private static void Instanciacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method

        LocalDate dataAtual = LocalDate.now();      // 2025-03-14

        // Data especifica
        LocalDate dataEspecifica1 = LocalDate.of(2025, 6, 30);
        LocalDate dataEspecifica2 = LocalDate.of(2023, Month.JANUARY, 12);

        System.out.println(dataAtual);         // Representação de um LocalDate: 2023-03-01
        System.out.println(dataEspecifica1);
        System.out.println(dataEspecifica2);
    }


    private static void StringConversaoData() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        // Conversão de String em LocalDate
        String stringData = "2023-01-17";
        LocalDate dataConcreta = LocalDate.parse(stringData);
        System.out.println(dataConcreta);
    }


    private static void AdicaoSubtracaoDatas() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2023, 3, 4);

        // Adição
        System.out.println(data.plusYears(15));
        System.out.println(data.plusMonths(15));
        System.out.println(data.plusDays(15));
        System.out.println(data.plusWeeks(15));

        // Subtração
        System.out.println(data.minusYears(15));
        System.out.println(data.minusMonths(15));
        System.out.println(data.minusDays(15));
        System.out.println(data.minusWeeks(15));
    }


    private static void ComparacaoDatas() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2025, 6, 30);
        LocalDate outraData = LocalDate.of(2024, 4, 3);

        //data2 está após a data 1? true
        System.out.println(outraData.isAfter(data));

        //data2 está antes que data 1? false
        System.out.println(outraData.isBefore(data));

        //data2 é igual a data 1? false
        System.out.println(outraData.isEqual(data));
    }


    private static void Formatacao() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2025, 6, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(data); // 2023-01-13

        // formatando a data criada acima
        System.out.println(formatter.format(data)); // 13/01/2023

        String stringDataBr = "17/01/2023";
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // 1param = string, 2param = DateTime no formato da String
        LocalDate dataConcreta = LocalDate.parse(stringDataBr, formater);
        System.out.println(dataConcreta.format(formatter));
    }


    private static void TiposDeDatas() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2025, 6, 30);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 30 de junho de 2025
        System.out.println(dataFormatada);

        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 30 de jun. de 2025
        System.out.println(dataFormatada);

        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 30/06/2025
        System.out.println(dataFormatada);

        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // segunda-feira, 30 de junho de 2025
        System.out.println(dataFormatada);
    }


    private static void LocalizacaoMeridiano() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2025, 6, 30);

        String dataFormatada1 = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("pt", "BR")));
        System.out.println(dataFormatada1);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi", "FI"), Locale.UK};

        for (Locale locale : locales) {
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }
    }


    private static void DadosEspecificos() {
        System.out.println("\n" + new Object() {
        }.getClass().getEnclosingMethod().getName());        // Get name of method
        LocalDate data = LocalDate.of(2025, 6, 30);

        System.out.println(data.getDayOfMonth());   // retorna o dia do mês -> 30
        System.out.println(data.getYear());         // retorna o ano -> 2025
        System.out.println(data.getMonth());        // retorna o elemento de enum java.time.Month -> JUNE
        System.out.println(data.getMonthValue());   // retorna o número do mês entre 1-12 -> 6
    }
}
