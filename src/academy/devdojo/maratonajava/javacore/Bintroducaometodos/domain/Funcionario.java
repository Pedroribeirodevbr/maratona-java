package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if(salarios == null) {
            return;
        }

        double media = 0;

        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial "+ media); // \n atalho para pular uma linha na impressão, pois o outro está só print e nao println
    }
}
