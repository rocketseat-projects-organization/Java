package je12_poo.enums;

public enum EstadoBrasileiro {
    PIAUI ("Piaui", "PI"),
    MARANHAO ("Amaranhao","MA"),
    SAO_PAULO ("São Paulo","SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro","RJ"),
    CEARA ("Ceará","CE"),
    ;

    private String nome;
    private String sigla;

    private EstadoBrasileiro (String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome () {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

}
