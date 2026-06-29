package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();

    }
}
