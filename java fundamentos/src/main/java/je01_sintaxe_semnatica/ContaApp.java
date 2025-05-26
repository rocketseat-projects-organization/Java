package je01_sintaxe_semnatica;

public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.sacar(10.0);
        conta.imprimirSaldo();
    }
}
