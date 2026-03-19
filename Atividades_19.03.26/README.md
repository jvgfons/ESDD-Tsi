## Integrantes da dupla

- **João Vitor Gomes da Hora Fontes** — BV3054888  
- **Gustavo Fernando Ferreira Vasconcelos Rinck** — BV3059685  

## Observação

O enunciado completo dos exercícios pode ser consultado no **arquivo `Aula 03 - Atividade para nota.docx` presente nesta pasta**, que foi disponibilizado pelo professor da disciplina.

## Exercicio 1
1.	Escreva uma função que decida se um vetor v[0..n-1] está em ordem crescente.  Depois, critique o código a seguir.

``` java
int verifica (int v[], int n) {
   int anterior = v[0], sim = 1;
   for (int i = 1; i < n && sim; ++i) {
      if (anterior > v[i]) sim = 0;
      anterior = v[i]; }
   return sim; }

```



Esse código verifica se um vetor está em ordem crescente. Primeiro, ele assume que está ordenado (sim = 1) e guarda o primeiro valor como referência (anterior = v[0]). Depois, começa a comparar cada elemento com o anterior. Se encontrar algum valor menor que o anterior, significa que a ordem foi quebrada, então sim vira 0 e o laço para. No final, a função retorna 1 se o vetor estiver ordenado, ou 0 se não estiver.

Nossa função:

```java
public static boolean crescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }
```

A nossa função criada para esse mesmo objetivo foi feita de forma diferente, achamos melhor utilizar o tipo boolean já que só é possível o vetor ser crescente ou não, caso seja retorna true, caso contrario retorna false.

A função percorre o loop até o penultimo elemento (vetor.length - 1), comparando o valor atual do índice i com p valor do proximo indice, caso o valor do proximo seja maior que o atual, o programa retorna falso, caso não ocorra isso em nenhum índice o programa não entra na condição do if e retorna true.


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

Essa versão de função de busca sequencial funciona de maneira diferente, ela realiza a busca e pode retornar o resultado mesmo que a chave buscada não esteja no vetor, o programa compara o valor do vetor atual no loop se encontrar um elemento v[j] maior ou igual a x, o laço é interrompido e retorna o valor do índice que satisfaz a condição.

Esse algoritmo não procura exatamente o valor x, mas sim a primeira posição onde x poderia ser inserido sem quebrar a ordem (assumindo que v está ordenado em ordem crescente).


## Exercício 4

```java
int buscaSeq4 (int x, int n, int v[]) {
   if (n == 0) return 0;
   if (x > v[n-1]) return n;
   return buscaSeq4 (x, n-1, v);
}
```

Essa função recursiva vai diminuindo o tamanho do vetor até encontrar o lugar certo onde o número x deve ficar, ela faz a mesma coisa que a função anterior, não procura o valor exato. Se o vetor estiver vazio, o caso base (condição de parada do loop) , ela retorna 0. Se x for maior que o último elemento, ela retorna n, que é a posição depois do último. Caso contrário, ela chama a si mesma com n-1, ou seja, vai olhando o vetor de trás para frente até achar a posição correta. É como se fosse uma busca sequencial, mas feita passo a passo com chamadas recursivas em vez de um laço.

#  Exercício 5






