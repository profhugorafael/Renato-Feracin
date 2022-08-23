class Aluno {
    
    // atributos
    public String nome;
    public int idade;
    public String telefone;
    public double altura;
    public double media;

    // métodos
    public void fazerAniversario() {
        idade++;
    }

    public int somar(int a, int b){
        return a+b;
    }

}

public class App {
    public static void main(String[] args) {
        Aluno joao = new Aluno();
        joao.nome = "Joao da silva";
        joao.idade = 17;
        joao.altura = 1.75;

        joao.fazerAniversario();
        System.out.println( joao.somar(2, 3) );

        System.out.println(joao.idade);

        Aluno maria = new Aluno();
        maria.nome = "Maria da silva";
        maria.idade = 17;
        maria.altura = 1.65;
    }
}