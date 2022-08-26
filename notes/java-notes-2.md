# Construindo novos objetos

```java
  Aluno aluno = new Aluno();
```

Isto faz referência ao construtor padrão.

```java

public class Aluno {

  // atributos
  // ...

  // construtor padrão
  public Aluno () {
    System.out.println("Construindo o aluno!");
  }

  // métodos
  //...

}

```

## Construtores personalizados

```java
class Aluno {
  // atributos
  public String nome;
  public int idade;
  public String telefone;
  public double altura;
  public double media;

  public Aluno(String nomeInput, int idadeInput, double alturaInput) {
    nome = nomeInput;
    idade = idadeInput;
    altura = alturaInput;
  }

  public void fazerAniversario(){
    idade++;
  }
}

```

## Sobrecarga

podemos colocar métodos com nome repetido, e criar vários contrutores para uma mesma classe, contanto que a o tipo e quantidade de parametros seja diferente.

```java

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
  
  ```