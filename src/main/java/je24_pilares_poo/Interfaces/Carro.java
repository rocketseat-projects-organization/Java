package je24_pilares_poo.Interfaces;

// Classe Carro implementando as duas interfaces
class Carro implements IVeiculo, ISistemaDeSom {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }

    @Override
    public void ligarSom() {
        System.out.println("Som do carro ligado!");
    }

    @Override
    public void desligarSom() {
        System.out.println("Som do carro desligado!");
    }
}
