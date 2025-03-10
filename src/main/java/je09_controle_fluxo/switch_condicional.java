package je09_controle_fluxo;

public class switch_condicional {
    public static void main(String[] args) {
        Simples();
        CasesCombinados();
        SwitchEnum();
        Yeld_Simplificado();
        Expressoes();
    }

    public static void Simples() {
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
        }
    }

    public static void CasesCombinados() {
        int numero = 2;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Número entre 1 e 3");
                break;
            case 4:
                System.out.println("Número 4");
                break;
            default:
                System.out.println("Número fora do intervalo");
        }
    }

    public static void SwitchEnum() {
        enum Dia {DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO}

        Dia dia = Dia.SEGUNDA;
        switch (dia) {
            case DOMINGO:
                System.out.println("Descanso");
                break;
            case SEGUNDA:
                System.out.println("Início da semana");
                break;
            default:
                System.out.println("Dia útil");
        }

    }

    /// Somente apartir do java 12
    public static void Yeld_Simplificado() {
        int numero = 2;
        String resultado = switch (numero) {
            case 1 -> "Primeiro";
            case 2 -> "Segundo";
            case 3 -> "Terceiro";
            default -> "Outro";
        };

        System.out.println(resultado);
    }

    public static void Expressoes() {
        int numero = 1;
        String resultado = switch (numero) {
            case 1 -> "Um";
            case 2 -> "Dois";
            default -> "Outro número";
        };

        System.out.println(resultado);
    }
}