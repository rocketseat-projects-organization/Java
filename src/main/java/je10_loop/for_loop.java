package je10_loop;

import java.util.Arrays;
import java.util.List;

public class for_loop {
    public static void main(String[] args) {
        // Explanation
        /*
        for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
            // comando que será executado até que a
            // expressão de validação torne-se falsa
        }
        */

        Default();
//        Simplified();
//        ForEach();
//        ForEachWithIncrement();
//        MultipleConditions();
//        ForWithListAndColections();
//        ForLambda();
//        LoopInfinite();
//        ForNested();

    }



    /**
     * Semelhante ao for Default, porém a variável "i" é definida antes.<br>
     * Contagem é feita após a estutura do loop.
     */
    private static void Simplified() {
        int i = 1;

        for (; i <= 20;) {
            System.out.println(i + " - Carneirinho(s)");
            i += 2;
        }
    }

    /** For Default
     */
    private static void Default() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " - Carneirinho(s)");
        }
    }

    /**
     * For Each
     */
    private static void ForEach() {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

    /**
     * For Each com Incremento
     */
    private static void ForEachWithIncrement() {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }

    /**
     * For Aninhado
     */
    private static void ForNested() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }

    /**
     * For Infinito
     */
    private static void LoopInfinite() {
        for (;;) {
            // Código que será repetido indefinidamente
            System.out.println("Este loop é infinito");

            break; // Interrompe após uma iteração para evitar loop infinito
        }
    }

    /**
     * For com Expressão Lamba
     */
    private static void ForLambda() {
        List<String> frutas = Arrays.asList("maçã", "banana", "laranja");
        frutas.forEach(fruta -> System.out.println("Fruta: " + fruta));
    }

    /**
     * For com Listas e Coleções
     */
    private static void ForWithListAndColections() {
        List<String> frutas = Arrays.asList("maçã", "banana", "laranja");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta: " + frutas.get(i));
        }
    }

    /**
     * For com multiplas condições
     */
    private static void MultipleConditions() {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
