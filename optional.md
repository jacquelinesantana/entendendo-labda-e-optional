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

É possível criar uma instância de Optional com valor através do método of. Ou seja, conseguimos definir o valor do Optional, entenda que para passar um valor para dentro de uma estrutura optional não deve-se apenas atribuir com o sinal de (=) igual, e sim incluir o valor com o método of.

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

## Empty

É possível indicar que uma instância de Optional tem valor vazio. 

```
String teste = Optional.empty()
```



## Map

É possível alterar/afetar um Stream com map. Por hora entenda Stream como sendo um formato de organizar dados.

```
IntStream.range(0, 4) // stream de 0 a 3 é uma sequencia de números de 0 a 3
 .map(e -> e * 2) // multiplica os elementos por 2  0*2, 1*2, 2*2... 
.forEach(System.out::println);//axibe os valores da multiplicação
```

## OrElse

Atua como o caso contrário de uma estrutura de decisão, retorna o valor definido no parâmetro. Para o código abaixo o Optional texto foi definido como empty, ou seja, sem um valor então o orElse vai assumir retornando seu valor como B();

```

public static void main(String args[]) {
	//o optional Empty é para o objeto retornar vazio com ele conseguimos colocar em prática o orElse() que executa o B 					System.out.println(Optional.empty().orElse(B())); 
	//orElse só executa quando não houver valores para o optional
} 
private static String B() { 
	String x = "Optional no java"; 
	return x; 
} 

```

