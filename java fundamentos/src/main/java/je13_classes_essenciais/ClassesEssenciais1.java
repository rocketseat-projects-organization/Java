package je13_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais1 {
    public static void main(String[] args) {
        try {
            System.out.println("Dvidindo 1/0");
            System.out.println(1/0);
        } catch (Exception ex) {
            System.err.print("Houve um erro na tentativa de divisão!");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println ("Digite seu nome: ");
        String nome = scan.next();

        System.out.println ("Digite sua idade: ");
        Integer idade = scan.nextInt(); // converte o valor inserido para um Integer

        System.out.println ("Digite sua idade: ");
        Double peso = scan.nextDouble(); // converte o valor inserido para um Double

        System.out.println ("Seu nome é : " + nome);
        System.out.println ("Sua idade é : " + idade);
        System.out.println ("Sua peso é : " + peso);



    }
}
