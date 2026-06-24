package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais04 {
    // Exercicio
    static void main(String[] args) {
        double salario = 500000;
        String resultado = "";
        if(salario <= 34712) {
            resultado = "Pagar taxa de 9.70%";
        }else if(salario >=34713 && salario <= 68504) {
            resultado = "Pagar taxa de 37.35%";
        }else{
            resultado = "Pagar taxa de 49.50%";
        }
        System.out.println(resultado);
    }
}
