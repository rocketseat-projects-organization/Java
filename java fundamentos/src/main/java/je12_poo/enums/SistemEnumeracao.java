package je12_poo.enums;

public class SistemEnumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";
        EstadoBrasileiro eb1 = EstadoBrasileiro.valueOf(nomeString.toUpperCase());

        EstadoBrasileiro eb2 = EstadoBrasileiro.CEARA;

        for (EstadoBrasileiro eb : EstadoBrasileiro.values()) {
            System.out.println("Estado Localizado:");
            System.out.println(eb.getNome());
            System.out.println(eb.name());
            System.out.println(eb.getSigla());
        }
    }
}
