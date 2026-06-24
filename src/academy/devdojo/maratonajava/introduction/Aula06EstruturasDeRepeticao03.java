package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor, por exemplo, 50
    static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax ; i++) {
            if(i > 25) {
                break;
            }
                System.out.println(i);
        }
    }
}
