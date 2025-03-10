package je02_variaveis;

public class Metodos {
    public static void main(String[] args) {
        // Estrutura
        //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        // Declaração de variáveis
        int numeroUm = 0;
        int numero2 = 0;

        // Uso dos métodos
        Metodos metodos = new Metodos();
        int soma = metodos.somar(numeroUm, numero2);
        System.out.println("Soma: " + soma);

        String cepFormatado = metodos.formatarCep(12345L);
        System.out.println("CEP formatado: " + cepFormatado);
    }

    int somar(int n1, int n2) {
        return n1 + n2;
    }

    String formatarCep(long cep) {
        return String.format("%05d", cep);
    }
}
