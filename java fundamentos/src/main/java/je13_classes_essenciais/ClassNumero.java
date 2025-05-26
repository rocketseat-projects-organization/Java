package je13_classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassNumero {
    public static void main(String[] args) {
//        java_lang_Integer();
//        ComparandoInteiros();
//        java_lang_Long();
//        java_lang_Double();
//        java_math_BigDecimal();
//        OperacoesBigDecimal();
        Scala();
    }


    private static void java_lang_Integer() {
        Integer min = Integer.MIN_VALUE; // retorna o menor número suportado
        Integer max = Integer.MIN_VALUE; // retorna o maior número suportado
        Integer numIn = Integer.valueOf("123"); // Converte um número em forma de texto (string) para número
        String numString = Integer.toString(123); // Converte um número para texto (string)
    }


    public static void ComparandoInteiros() {
        Integer numero1 = 100;
        Integer numero2 = 100;

        System.out.println(numero1 == numero2);
        System.out.println(numero1.equals(numero2));

        numero1 = 128;
        numero2 = 128;

        // acima de 127, internamente o Java cria um novo objeto do tipo Integer -> Integer numero1/2 = new Integer(128)
        // logo estamos agora nos referindo a dois objetos na aplicação.
        System.out.println(numero1 == numero2);
        System.out.println(numero1.equals(numero2));
        System.out.println(numero1.intValue() == numero2.intValue());
    }


    private static void java_lang_Long() {
        // considerar NÃO existir probabilidade de zero à esquerda
        Long celular;
        Long codigoBarras;

        // Literais numéricos por padrão são convertidos para Integer
        // Logo, é necessário acrescentar o sufixo L para determina-lo com Long
        Long numero = 130L;
    }


    private static void java_lang_Double() {
        Double numeroDecimal = 1234.5678;
        // representação BR -> 1.234,5678

        Double numeroDecimal1 =1234.5678;
        Integer numeroInteiro = numeroDecimal1.intValue();  // 1234
    }


    private static void java_math_BigDecimal() {
        // Constantes
        BigDecimal zero = BigDecimal.ZERO;      // 0
        BigDecimal resultado = zero.add(new  BigDecimal("100"));    // 100
        resultado = resultado.subtract(new  BigDecimal("27.5"));  // 72,5

        BigDecimal decimal = BigDecimal.valueOf(1234.5678);         // 1234.5678
        BigDecimal numeroString = new BigDecimal("1234.5678");  // 1234.5678
    }


    public static void OperacoesBigDecimal() {
        BigDecimal um = BigDecimal.ONE;
        BigDecimal dez = BigDecimal.TEN;

        BigDecimal resultado = dez.add(um); // 9

        BigDecimal calculoComplexo1 = dez.subtract(um).divide(new BigDecimal(3));          // 3
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal calculoComplexo2 = BigDecimal.TEN.divide(divisor, RoundingMode.HALF_EVEN);  // 3

        System.out.println(calculoComplexo1); // ???
        System.out.println(calculoComplexo2); // ???

    /*
      add -> somar
      subtract -> subtrair
      multiply -> multiplicar
      divide -> dividir
    */
    }


    private static void Scala() {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal listrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = listrosUtilizados.multiply(precoLitro);
        System.out.println(valorPagar); // 126.139848

        // arredondamendo ..., O primeiro parametro determina o número de digitos após a vírgula
        // Segundo parametro, tip ode arredondamento
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado); // 126.14
    }
}
