package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! negacao
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcolica");
        }else{
            System.out.println("Nao Autorizado comprar bebida alcolica");
        }
        if(isAutorizadoComprarBebida == false){ // !
            System.out.println("Nao Autorizado comprar bebida alcolica");
        }
    }
}
