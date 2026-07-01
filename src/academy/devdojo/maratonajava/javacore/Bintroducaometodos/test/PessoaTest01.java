package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
  //      pessoa.nome = "Savarino";
        pessoa.setNome("Savarino");
        pessoa.setIdade(70);
  //      pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }

}
