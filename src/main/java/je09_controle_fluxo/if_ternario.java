package je09_controle_fluxo;

public class if_ternario {
    public static void main(String[] args) {
        int nota = 6;

        TernarioSimples(nota);
        TernarioComplexo(nota);
    }

    public static void TernarioSimples(int nota) {
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    }

    public static void TernarioComplexo(int nota) {
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado");
    }
}
