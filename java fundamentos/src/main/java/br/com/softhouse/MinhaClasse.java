package br.com.softhouse;

import java.math.BigDecimal;
//import br.com.softhouse.model.User;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "galyson";
        Integer idade = 10;
        BigDecimal altura = BigDecimal.ONE;
        System.out.println(altura);

        br.com.softhouse.model.User user = new br.com.softhouse.model.User();
        user.showMyName();

        User userLocal = new User();
        userLocal.showMyName();
    }
}
