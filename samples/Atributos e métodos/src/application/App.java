package application;
import entities.Aluno;

public class App {
    public static void main(String[] args) {

        Aluno joao 
            = new Aluno("Joao da silva",
                        17,
                        1.75);

        joao.fazerAniversario();
        
        System.out.println( joao.somar(2, 3) );

        System.out.println(joao.getNome());

        Aluno maria 
            = new Aluno("Maria da silva",
                        17,
                        1.65);

    }
}