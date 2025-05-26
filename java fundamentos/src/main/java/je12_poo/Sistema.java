package je12_poo;

import java.lang.constant.Constable;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Sampaio");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        System.out.println(gleyson.limiteCredito);

        gleyson.Comprar(50.0);


        Cliente isabelly = new Cliente("Isabelly Sampaio");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(80.0);
        System.out.println(gleyson.limiteCredito);

        isabelly.Comprar(22.0);


        System.out.println("Limite do(a) " + isabelly.nome + " é " + isabelly.limiteCredito);
        System.out.println("Limite do(a) " + gleyson.nome + " é " + gleyson.limiteCredito);
    }
}
