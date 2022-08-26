package entities;

public class Aluno {
    
  // atributos
  private String nome;
  private int idade;
  private String telefone;
  private double altura;
  private double media;

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

  // getters and setters
  public String getNome () {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    if( telefone.length() == 11 ) {
      this.telefone = telefone;
    } 
  }

  public double getAltura() {
    return altura;
  }

  public double getMedia() {
    return media;
  }

  public void setMedia(double media) {
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