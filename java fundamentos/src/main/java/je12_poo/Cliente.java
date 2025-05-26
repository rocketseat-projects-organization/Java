package je12_poo;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;


    // Construtor Default
    public Cliente() {
    }

    // Construtor Default Customizado
    public Cliente(String nomeInformado) {
        this.nome = nomeInformado;
    }

    public void solicitarLimiteCredito(double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }

    public void Comprar(Double valorProduto) {
        limiteCredito -= valorProduto;
    }
}
