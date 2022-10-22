# Programação funcional

Através da programação podemos passar funções como argumentos de outras funções e associar funções a variáveis também.

## Grandes tipos

1. **Predicate** 
   
- recebe T (genérico)
- retorna boolean

Todo `Predicate` é um tipo capaz de guardar funções que recebem um argumento genérico e **sempre** retornam booleano.

```java
Predicate<Integer> verificaSePar = (n) -> n%2 == 0;
```
```java
  users
    .stream()
    .filter( u -> u.getCargo().equals("Moderador") )
    .collect( Collectos.toList() );
```

1. **Action** - retorna void

- recebe T (genérico)
- retorna void

```java
  users.forEach( u -> System.out.println(u) );
  users.forEach( System.out::println );
```

3 **Function** - recebe

- recebe T1, T2, T3, ... (genéricos)
- retorna R

```java
  users.stream()
    .map( u -> new UserDto(u) )
    .collect(Collectors.toList());
```
- 
## Funções Explicitas

exemplo explicito:
```java
Predicate<Aluno> condicao = Aluno::veficaSeAprovado; 
```

## Função implicita - arrow Function

Também chamamos de expressões lambda.

```java
Function<Integer, Integer, Integer> refSoma = (a, b) -> a+b
```

