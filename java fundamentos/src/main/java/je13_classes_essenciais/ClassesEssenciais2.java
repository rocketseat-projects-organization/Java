package je13_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais2 {
    public static void main(String[] args) {
        String nome = null;
        Integer idade = null;
        Double peso=null;

        // simulando uma linha existente em um arquivo txt
        String stringLinhaArquivo = "gleyson sampaio;32;1.59";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";"); // definindo um delimitador
        // conhecendo novos recursos
        int index = 0;
        while (scan.hasNext()){ // olha um conceito de controle de repetição sendo aplicado, tudo está mais claro agora hein??
            if(index == 0) // Uuufa, sorte que eu aprendi sobre controle de fluxo e operadores anteriormente
                nome = scan.next();
            else if( index == 1)
                idade  = Integer.valueOf(scan.next());
            else
                peso = Double.valueOf(scan.next());

            index ++; // mais um conceito escondido bem aqui !!
        }

        System.out.println ("Seu nome é : " + nome);
        System.out.println ("Sua idade é : " + idade);
        System.out.println ("Sua peso é : " + peso);

        // scan.nextBigDecimal(); scan.nextBoolean(); -> já sacou o conceito, correto ?
    }
}
