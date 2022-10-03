# Optional

A principal proposta deste recurso é encapsular o retorno de métodos e informar se um valor do tipo <T> está presente ou ausente.
Com isso é possível:

1. Evitar erros NullPointerException.
2. Parar de fazer verificações de valor nulo do tipo if (cliente != null).
3. Escrever código mais limpo e elegante.

## O que podemos fazer com Optional?

1. É possível criar uma instância de Optional com valor através do método **of**. 
2. É possível criar uma instância de Optional sem valor através do método **empty**. 
3. É possível checar se uma instância de Optional possui um valor através do método **isPresent**. 
4. É possível recuperar o valor de uma instância de Optional através do método **get**. 
5. É possível popular um alterar/afetar um Stream com **map**
6. É possível método **orElse** retorna um valor diretamente

## OF

É possível criar uma instância de Optional com valor através do método of

```
//para um optional utilizamos 
Optional<String> xz1 = Optional.of("Somos todes Devs");

//equivale a xz1 = ("Somos todes Devs"), inserir o dado dentro de xz1
```

## GET

É possível recuperar o valor de uma instância de Optional através do método get. Ao executar o código abaixo pode-se notar que o get esta escrevendo o valor que esta em xz1, ou seja "Somos todes devs"

```
Optional<String> xz1 = Optional.of("Somos todes Devs");
String frase = xz1.get() ;
System.out.println(xz1.get() );
```

