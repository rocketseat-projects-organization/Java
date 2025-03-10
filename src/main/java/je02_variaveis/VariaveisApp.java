package je02_variaveis;

public class VariaveisApp {
    public static void main(String[] args) {
        // Prefixo "final" na declaração da variável indica palavra imutável
        final String BR = "Brasil";
        String FR = "França";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;


        // Declaração inválida de variáveis
        //int numero&um = 1; // Os únicos símbolos permitidos são _ e $
        //int 1numero = 1;    // Uma variável não pode começar com numérico
        //int numero um = 1; // Não pode ter espaço no nome da variável
        //int long = 1; // long faz parte das palavras reservadas da linguagem

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1; // ou numeroUm
        int longo = 1;
    }
}
