package academy.devdojo.maratonajava.introduction;

public class Aula04Operadores {
    static void main(String[] args) {
        /* Basic Arithmetics Operators   + - / *
        O resultado da operacao entre 2 valores int sera int valores decimais usar o double */
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // % é operador para identificar o resto
        int resto = 21%7;
        System.out.println(resto);

        // < > <= >= == !=  Basic Logic Operator they always returned booleans values True or False
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDiferenteDez "+isDiferenteDez);

        // && (and) / (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=  esses sao operadores de Atribuicao
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador +=1; // contador = contador +1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(++contador2);
    }
}
