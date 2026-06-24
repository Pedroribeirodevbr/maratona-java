package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao04 {
    static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + "x R$ " + valorParcela);
        }

    }
}

