package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

    }
}
