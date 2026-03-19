## Exercicio 1

``` java
int verifica (int v[], int n) {
   int anterior = v[0], sim = 1;
   for (int i = 1; i < n && sim; ++i) {
      if (anterior > v[i]) sim = 0;
      anterior = v[i]; }
   return sim; }

```

Esse codigo verifica se o vetor é crescente, primeiro, ele recebe o vetor em "int v[]" e o tamanho do vetor em "int n" , depois ele assume que o vetor está ordenado, em  int anterior = v[0], sim = 1 , a partir do segundo elemento, ele entra no For, a cada passo o for verifica se "i < n && sim" , ou seja em qualquer momento que i ou sim estiverem com valor 0, o loop se encerra e retorna o valor de sim, que varia entre 1 ou 0, dentro do For, temos um if, ele verifica se o índice anterior é maior que a posição de i, que é a posição que o loop está verificando no momento, caso seja, define o valor 0 para sim, saindo do for e retornando o valor de sim, que nesse caso é 0.

## Exercício 2

2.	Critique a seguinte formulação do problema de busca: dado x e um vetor crescente v[0..n-1], encontrar um índice j tal que v[j-1] ≤ x ≤ v[j]. 

Essa formulação tem alguns problemas, o 1º é com o índice j-1, pois se j=0 a condição seria v[-1] ≤ x ≤ v[0], mas v[-1] não existe no vetor

Outro problema seria em casos em que x é maior ou menor que todos elementos do vetor,por exemplo

v = [10, 20, 30]
x = 5

nesse caso não existe j que satisfaça v[j-1] ≤ 5 ≤ v[j] pois não tem nenhum par de números nesse vetor onde o número 5 estaria entre eles

a mesma coisa acontece se utilizarmos um número maior que todos os numeros do vetor.

A formula também não define o domínio de j, algo como 0 ≤ j < n deveria ser declarado para informar quais são os índices válidos.

## Exercício 3


3.	Discuta a seguinte versão da função busca Sequencial: 
```java
	int buscaSeq2 (int x, int n, int v[]) {
	   int j;
	   for (j = 0; j < n; ++j) 
	      if (x <= v[j]) break;
	   return j; }
```

Essa versão de função de busca sequencial funciona de maneira diferente, ela realiza a busca e pode retornar o resultado mesmo que a chave buscada não esteja no vetor, o programa compara o valor do vetor atual no loop, com o valor buscado, se for maior ou igual ao valor buscado o programa para e retorna o valor do índice que satisfaz a condição.
