package je11_exceptions;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Exceptions {
    public static void main(String[] args) throws CepInvalidoException {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //ExceptionSimples(scanner);
        String retorno = FormatarCep(scanner);
    }

    static String FormatarCep(Scanner scanner) throws CepInvalidoException{
        System.out.println("Digite seu CEP: ");
        String cep = scanner.next();

        if(cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }

    private static void ExceptionSimples(Scanner scanner) {
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = -1;
        try {
            idade = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve informar um valor do tipo numérico.");
        } finally {
            System.out.println("Bloco finally sempre será executado.");
        }




        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();

    }
}
