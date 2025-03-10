package je10_loop;

public class break_e_continue {
    public static void main(String[] args) {
//        BreakUse();
        ContinueUse();
    }

    /**
     * Finaliza a execução do loop ao chegar no "break"
     */
    private static void BreakUse() {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;

            System.out.println(numero);
        }

        // Qual a saída no console ?  = 2
    }

    /**
     * Pula o item atual e continua a execução do loop no próximo item
     */
    private static void ContinueUse() {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            System.out.println(numero);
        }

        // Qual a saída no console ? = 5
    }
}
