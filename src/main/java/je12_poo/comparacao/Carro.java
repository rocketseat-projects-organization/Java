package je12_poo.comparacao;

import java.util.Objects;

public class Carro {
    //atributos de mesmo tipo
    String cor, marca, modelo;

    //construtor
    Carro (String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    //identificador de igualdade
    //os 3 atributos precisem ser idênticos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(cor, carro.cor) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, modelo);
    }
}
