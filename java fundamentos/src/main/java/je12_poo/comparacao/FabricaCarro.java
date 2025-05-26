package je12_poo.comparacao;

public class FabricaCarro {
    public static void main (String [] args){
        Carro carro1 = new Carro("branca","fiat","palio");
        Carro carro2 = new Carro("branca","fiat","palio");
        Carro carro3 = new Carro("branca","fiat","palio");
        Carro carro4 = new Carro("branca","fiat","palio");
        Carro carro5 = new Carro("branca","fiat","palio");

        //case01
        System.out.println(carro1 == carro2); //false - Porque são duas instâncias e aqui comparamos as instâncias
        //case02
        System.out.println(carro1.equals(carro2)); //true - usando igual verificamos se os valores no objeto são iguais
        System.out.println(carro1.equals(carro3)); //true
        System.out.println(carro1.equals(carro4)); //true
        System.out.println(carro1.equals(carro5)); //true

        //case03
        Carro carro6 = carro1; // não é um novo carro, mas sim, uma referência ao mesmo carro
        System.out.println(carro6 == carro1); // true - Pois estamos apontando para a mesma referência
        System.out.println(carro6.equals(carro1)); // true - Pois os valores são os mesmos
    }
}
