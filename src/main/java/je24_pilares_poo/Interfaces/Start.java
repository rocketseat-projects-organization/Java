package je24_pilares_poo.Interfaces;

/// Programa principal
public class Start {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        // Chamando métodos da interface Veiculo
        meuCarro.acelerar();   // Saída: Carro acelerando...
        meuCarro.frear();      // Saída: Carro freando...

        // Chamando métodos da interface SistemaDeSom
        meuCarro.ligarSom();   // Saída: Som do carro ligado!
        meuCarro.desligarSom(); // Saída: Som do carro desligado!
    }
}
