package je07_javadoc;

/**
 * Calculadora Simples
 * @author Samuel Hermany
 * @since v1.0
 */
public class Calculadora {
    /**
     * Reealiza a divisão entre dois números inteiros
     *
     * @param dividendo     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo*
     * @return              O resultado da divisão entre o divisor e o dividendo
     * @exception           java.lang.ArithmeticException em caso de passar divisor igual a 0
     */
    Integer dividr (Integer dividendo, Integer divisor) {
        return dividendo/divisor;
    }

}
