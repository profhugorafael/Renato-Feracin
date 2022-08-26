class Aluno {
    
    // atributos
    public String nome;
    public int idade;
    public String telefone;
    public double altura;
    public double media;

    // contrutor padrão (desabilitado)
    // public Aluno () {
    //     System.out.println("Criando um Aluno!");
    // }

    // construtor personalizado
    public Aluno(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public Aluno(String nome, int idade, String telefone, double altura, double media) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.altura = altura;
        this.media = media;
    }

    // métodos
    public void fazerAniversario() {
        idade++;
    }

    public int somar(int a, int b){
        return a + b;
    }

    public int somar(int a, int b, int c){
        return a + b + c;
    }

}

public class App {
    public static void main(String[] args) {

        Aluno joao 
            = new Aluno("Joao da silva",
                        17,
                        1.75);

        joao.fazerAniversario();
        System.out.println( joao.somar(2, 3) );

        System.out.println(joao.idade);

        Aluno maria 
            = new Aluno("Maria da silva",
                        17,
                        1.65);

    }
}