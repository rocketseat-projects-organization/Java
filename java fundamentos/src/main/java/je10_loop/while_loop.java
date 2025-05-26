package je10_loop;

public class while_loop {
    public static void main(String[] args) {
        //Simples();
        Randomic();
    }

    private static void Simples() {
        int i = 0;

        while (i <= 10) {
            System.out.println("Contagem: " + i);

            i++;
        }
    }


    private static void Randomic() {
        boolean saida = true;

        while (saida) {

            int numeroAleatorio = (int) (Math.random() * 10) + 1;
            if (numeroAleatorio == 10) {
                saida = false;
            }

            System.out.println("Número aleatório: " + numeroAleatorio);
        }
    }
}
