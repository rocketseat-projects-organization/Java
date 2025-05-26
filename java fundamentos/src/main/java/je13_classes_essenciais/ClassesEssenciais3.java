package je13_classes_essenciais;

public class ClassesEssenciais3 {
    public static void main(String[] args) {
//        ClassPrintStream();
//        StringConcat_StringBuilder();
//        StringSubstring();
        Diversos();
    }

    private static void Diversos() {
        String nome = "Gleysom;Sampaio;programador";
        nome.toUpperCase();
        nome.toLowerCase();
        String[] nomeValor = nome.split(";");
        System.out.println(nomeValor[0]);   // Gleysom
        System.out.println(nomeValor[1]);   // Sampaio
        System.out.println(nomeValor[2]);   // programador
    }

    public static void ClassPrintStream() {
        String nome = "Gleysom";
        int idade = 32;
        double peso = 1.58;
        double renda = 3234.56;

        // vamos imprimir os dados acima aplicando uma formatação no console
        // System.out.printf(formato, array de parâmetros (,,,) );

        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", nome, idade, peso, renda);

        // Resultado no console: Nome: gleyson Idade: 32 Peso: 1,58 Renda: R$ 3.234,56

        //%s ->     parâmetros do tipo String
        //%d ->     parâmetros do tipo Integer / Long
        //%f ->     parâmetros do tipo Double / Float
        //.2 ->     quer dizer que serão dois dígitos decimais
        //,.2 ->    quer dizer que serão dois dígitos decimais e informando o (.) de milhar
    }

    public static void StringConcat_StringBuilder() {
        String nome = "Gleysom";
        nome = nome.concat(" sampaio,");
        nome = nome.concat(" sou desenvolvedor");
        System.out.println(nome);
        // Gleysom sampaio, sou desenvolvedor

        String sb = "Gleysom" +
                " sampaio";
        System.out.println(sb);
        // Gleysom sampaio

        StringBuilder stringAlteravel = new StringBuilder("gleyson ");

        // acrescentando o conteúdo sampaio
        stringAlteravel.append("sampaio");

        // substituindo o nome gleyson (os 7 digitos) para izabelly
        stringAlteravel.replace(0, 7, "izabelly");

        // removendo o nome sampaio com um espaço no início
        stringAlteravel.delete(8, 16);

        /*
          inserindo o conteúdo sampaio novamente
          a diferença entre insert e append é que o insert possibilita informar a posição
          inclusive no início do conteúdo
        */
        stringAlteravel.insert(8, " sampaio");
        stringAlteravel.insert(0, "Miss ");

        System.out.println(stringAlteravel);
    }

    public static void StringSubstring() {
        String str = "abc";

        // é equivalente a:
        char[] data = {'a', 'b', 'c'};
        String str1 = new String(data);

        // aqui mais alguns recursos oferecidos pela classe String
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);

        String password = "Sup3rP@ss!$%*&";
    }
}
