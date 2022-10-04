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

Aplicando um exemplo:

```
System.out.println("Imprime lista!"); 

List<Integer> shakira = Arrays.asList(10, 20, 30, 40);

 shakira.forEach(x -> {
 	System.out.println(x); 
});
```

1. Imprime no console

2. Realiza uma lista apelidada como shakira com os valores (10, 20, 30, 40);

3. Faz looping/forEach na shakira que é a minha lista 

4. Torna **implícito** para **x (que ele receberá os valores da shakira)**

5. Imprime o x – que é um dos valores da shakira e volta para o inicio do bloco forEach

6. Quem é a lambda? **x -> { System.out.println(x); }** 

   **Implícito** =
    contido numa proposição mas não expresso formalmente;
    não manifestamente declarado; subentendido.

```
System.out.println("Imprime lista!"); 

List<Integer> astolfo = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

 astolfo.forEach(n -> {
 	if(n % 2 == 0) { 
	    System.out.println(n); 
	} 
});
```

1. Imprime no console
2. Realiza uma lista apelidada como astolfo com os valores (1, 2, 3, 4, 5, 6, 7);
3. Faz looping/forEach no astolfo que é a minha lista 
4. Torna implícito para n, recebe os valore do astolfo e verifica que se o resto de n/2 for 0...
5. Imprime o **n**
6. Fecha o if
7. Termina a expressão lambda
   Quem é a expressão lambda? **n -> { if (n % 2 == 0) { System.out.println(n); }** 

Prática para Lambda ->  [Link Código](https://github.com/jacquelinesantana/entendendo-labda-e-optional/blob/main/pratica/Lambda-e-Optional/src/atividades/LambdaAtividade.java)

[Voltar](https://github.com/jacquelinesantana/entendendo-labda-e-optional#readme)