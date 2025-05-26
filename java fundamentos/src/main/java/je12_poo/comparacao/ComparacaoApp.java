package je12_poo.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        // stack vs heap

        Integer i1 = 128;       // Memória stack
        Integer i2 = Integer.parseInt("128");


        // Comparação de objetos
        System.out.println(i1 == i2);       // false - A váriável "i2" srr maior que 127bytes e estar na memória heap
        // Comparação de valores
        System.out.println(i1.equals(i2));  // true  - As váriáveis


        String str1 = "gleyson";
        String str2 = "gleyson";
        String str3 = new String("Gleyson");

        System.out.println(str1 == str2);                  // true  - Comparação de dois valores iguais, na memória somente é armazenado um ponteiro paras os dois
        System.out.println(str1 == str3);                  // false - Comparação de dois objetos porque eu criei um novo objeto com o "new"
        System.out.println(str1.equals(str3));             // false - Comparação do conteúdo da string e não da referência em memória
        System.out.println(str1.equalsIgnoreCase(str3));   // true - Comparação do conteúdo da string ignorando Maiúscula e minúscula
     }
}
