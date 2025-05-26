package je10_loop;
import java.util.Scanner;

public class doWhile_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Continua até o usuário digitar um número válido
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Número válido digitado: " + numero);
        scanner.close();


    }
}
