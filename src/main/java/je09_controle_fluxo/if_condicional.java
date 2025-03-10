package je09_controle_fluxo;

public class if_condicional {
    public static void main(String[] args) {
        int nota = 6;

        CondicionalIf(0);
        CondicionalIfElse(nota);
        CondicionalIfElse(nota);
    }

    public static void CondicionalIf(int nota) {
        if (nota >= 7)
            System.out.println("Aprovado");
    }

    public static void CondicionalIfElse(int nota) {
        if (nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    public static void CondicionalIfElseIf(int nota) {
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
