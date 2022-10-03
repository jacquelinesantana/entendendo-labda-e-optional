# O que são expressões Lambda?

As expressões lambda representam uma função anônima, ou seja, uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As expressões lambda em Java tem uma sintaxe definida
como: **(argumento -> (corpo))**

São exemplos de expressão lambda:

- (int a, int b) -> { return a + b; }
-  () -> System.out.println("Hello World"); 
- (String s) -> { System.out.println(s); } 
- () -> 42 
- () -> { return 3.1415 }; 
- a -> a > 10

## Comparando uma expressão lambda e mesma escrita sem a lambda

### Exemplo sem lambda

```
System.out.println("Imprime todos os elementos da lista!"); 
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
for(Integer n: list) { System.out.println(n); }
```



### Exemplo com lambda

```
System.out.println("Imprime todos os elementos da lista!");
 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
 list.forEach(n-> System.out.println(n));
```

**Leitura do código**

no exemplo acima podemos ver duas formas de se escrever uma listagem com números, esses números estão passando pela estrutura de escrita na tela:

para o modelo 1 usamos a estrutura for, onde ele cria um dado do tipo integer e joga a listagem no mesmo, a partir desse momento ele usa o Println para exibir os valores na tela.

para o modelo 2 usamos o forEach que recebe o list, para ele é passado o n que não foi declarado como Integer pois fica subentendido automaticamente e o n esta sendo escrito na tela através do println - foi escrito a mesma função mas de forma mais direta onde o código subentende algumas partes e já executa o esperado.

