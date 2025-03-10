package je01_sintaxe_semnatica;

public class Conta {
    // variável da classe conta
    double saldo = 100.0;
    double novoSaldo = 0.0;

    public void sacar(double valor) {
        // variável do método
        novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        // disponível em toda classe
        System.out.println("Saldo antigo:R$" + saldo);
        // somente o método sacar conhece esta variável
        System.out.println("Saldo atual:R$" + novoSaldo);
    }
}