# Classe Abstratas

São classes que não tem o objetivo de criarem objetos, apenas de serem uma base para a criação de novas classes.

```java
public abstract class Forma {

  private Double espessura;
  private Color cor; // enum

  // aguardando para serem implementados
  public abstract double area();
  public abstract double perimetro();

}
```

# Generics

Generics são marcações que podemos colocar nas classes ou métodos de modo a fazer uma tipagem dinâmica.

```java
public class Fila {

  private List<Integer> ints;

  public Fila(){
    ints = new ArrayList<>();
  }

  public void add(Integer x) {
    ints.add(x);
  }

  public void print() {
    for(Integer i : ints) {
      System.out.println(i);
    }
  }

}
```

## Com uso de Generics

Escolheremos a letra T como um tipo generico

```java
public class Fila <T> {
  private List<T> elements;

  public Fila(){
    elements = new ArrayList<>();
  }

  public void add(T element) {
    elements.add(element);
  }

  public void print() {
    for(T element : elements) {
      System.out.println(element);
    }
  }
}
```