package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        // (condicao) ? verdadeiro : falso
        // Aula sobre operador ternário
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
