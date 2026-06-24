package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "Onix";
        carro1.modelo = "Joy";
        carro1.ano = 2019;

        carro2.nome = "BYD";
        carro2.modelo = "King";
        carro2.ano = 2027;
        System.out.println("Carro 1: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }
}
