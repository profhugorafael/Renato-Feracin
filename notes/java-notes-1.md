# POO

## Motivação

Modelando problemas reais sem orientação a objetos.

```java
String[] nomes, telefones;
double[] alturas, medias;
int[] idades;

int a = 2, b = 3;
int aux = a; // a = 2, b = 3, aux = 2
a = b // a = 3, b = 3, aux = 2
b = aux; // a = 3, b = 2, aux = 2
```

## Classes e objetos

```java
class Aluno {
  // atributos
  public String nome;
  public int idade;
  public String telefone;
  public double altura;
  public double media;

  public void fazerAniversario(){
    idade++;
  }
}

public class Program {
  public static void main(String[] args) {
    Aluno joao = new Aluno();
    joao.nome = "Joao da silva";
    joao.idade = 17;
    joao.altura = 1.75;

    System.out.println(joao.idade);

    Aluno maria = new Aluno();
    maria.nome = "Maria da silva";
    maria.idade = 17;
    maria.altura = 1.65;
  }
}
```