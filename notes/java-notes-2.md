# Estruturas de seleção (`if-else`)

## Estrutura básica do if

```
Se ( condição ) {
  código a ser executado se for verdade
}
```

> Usamos o `if` para impor uma condição, e validar se um bloco de código deve ou não ser executado.

```java
if ( /* condição */ ) {
  // codigo
}
```

exemplo: 

```java
double nota = 7.9;

if( nota >= 7.0 ) {
  System.out.println("Aprovado!");
} 
```

## Estrutura `if-else`

> Iremos reaproveitar a verificação realizada pelo `if` para tomar uma conclusão oposta e executar caso a condição imposta seja falsa.

```java
if ( /* condição */ ) {
  // codigo se a condição for verdadeira
} else {
  // código se a condição for falsa
}
```

```java
double nota = 7.9;

if( nota >= 7.0 ) {
  System.out.println("Aprovado!");
} else {
  System.out.println("Recuperação");
}
```

## Desafio

Faça um programa que baseado em uma variável nota exiba os seguintes resultados:

1. Se a nota for maior ou  igual que 7: Diga que o aluno foi aprovado.
2. Se a nota estiver entre 4(inclusive) e 7(exclusive): Diga que o aluno esta de recuperação
3. Se a nota for menor que 4: Diga que o aluno foi reprovado.