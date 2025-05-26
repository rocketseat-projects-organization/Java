package je_27_testes;

import org.junit.jupiter.api.*;


public class CalculadoraTest {
    private Calculadora calculadora;

    /**
     * Estrutura de teste
     */
    @Test
    public void nomeDoTeste(){
        // ARRANGE

        // ACT

        // ASSERT

        // CLEANUP (se necessário)
    }

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Executa depois de cada teste");
    }
    /**
     * Soma dois números
     * @ Return = resultado da soma
     */
    @Test
    @DisplayName("Teste Modelo")
    public void somarDoisNumerosPositivoENegativo_ReturnSoma(){
        // ARRANGE
        var calculadora = new Calculadora();
        int valorNegativo = -5;
        int valorPositivo = 10;
        int expecteed = 5;

        // ACT - executar a ação / metodo que será testado
        int resultado = calculadora.somar(valorNegativo, valorPositivo);

        // ASSERT - verificar se o resultado está correto
        Assertions.assertEquals(expecteed, resultado);

        // CLEANUP - opcional en testes unitários
        // fechar conexões, limpar arquivos....
    }

    /**
     * Soma dois números
     * @ Return = resultado da soma
     */
    @Test
    @DisplayName("Test sem Setup")
    public void somarDoisNumeros_ReturnSoma(){
        var calculadora = new Calculadora();
        var actual = calculadora.somar(5, 4);

        Assertions.assertEquals(9, actual);
    }

    @Test
    @DisplayName("Test com Setup")
    public void somarDoisNumeros_ReturnSoma_ComSetup(){
        var actual = calculadora.somar(5, 4);
        Assertions.assertEquals(9, actual);
    }
}
