# Getters and Setters

Por segurança, vamos remover todos os acessos dos atributos abaixo.

```java
class Aluno {
    
    // atributos
    private String nome;
    private int idade;
    private String telefone;
    private double altura;
    private double media;

}
```

## Problema da abordagem

Perdemos também a consulta, apesar de termos alcançado o objetivo da não alteração deliberada.

## Solução

Criamos métodos auxiliares que nos ajudam a acessar estas variáveis. Controlamos o acesso através de métodos personalizados e não de variáveis já prontas pela linguagem.

```java
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

  // ...
```