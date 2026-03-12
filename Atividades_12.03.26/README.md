# Atividades - 12/03/2026

Esta pasta contém as atividades propostas para entrega no dia **12/03/2026**

## Descrição

Nesta atividade foram desenvolvidos **8 programas utilizando a técnica de recursividade**, conforme solicitado no **documento `.docx` enviado pelo professor**, que também está incluído nesta pasta.

Os programas implementam diferentes exercícios com o objetivo de praticar e compreender o funcionamento da **recursividade em algoritmos**.

## Integrantes da dupla

- **João Vitor Gomes da Hora Fontes** — BV3054888  
- **Gustavo Fernando Ferreira Vasconcelos Rinck** — BV3059685  

## Observação

O enunciado completo dos exercícios pode ser consultado no **arquivo `.docx` presente nesta pasta**, que foi disponibilizado pelo professor da disciplina.

## Código dos exercícios

---

## Exercício 1

```java
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");

        num1 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite a potencia para o primeiro numero: ");
        num2 = Integer.parseInt(scan.nextLine());

        System.out.printf("O resultado de %d elevado a %d é: %d", num1, num2, potencia(num1, num2));

        scan.close();
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            int resultadoParcial = potencia(base, expoente - 1);
            int resultado = base * resultadoParcial;
            return resultado;
        }
    }
}
```

## Exercício 2

```java
import java.util.Scanner;

public class atividade2
{
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int n[]  = new int[10];
	
	for (int i = 0; i < 10; i++){
	    System.out.print("Digite um numero: ");
	    n[i] = Integer.parseInt(scan.nextLine());
	}
	
	System.out.println("Menor numero: " + Vetor(n,10));

    scan.close();
}

public static int Vetor(int[] n, int fim){
    if (fim == 1){          // caso base
        return n[0];
    } else {
        int menor = Vetor(n, fim - 1);   // menor dos anteriores
        if (n[fim - 1] < menor){
            return n[fim - 1];
        } else {
            return menor;
        }
    }
}
}
```

## Exercício 3

```java
//Atividade 3

/*Crie um programa que receba um vetor de números reais com 10 elementos. 
Escreva um método recursivo que inverta a ordem dos elementos presentes no vetor.
*/

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        int vetor [] = new int[10]; //Cria um vetor de inteiros com 10 elementos

        Scanner scan = new Scanner(System.in); //Inicializa o Scanner para ler a entrada do usuario

        System.out.print("Digite 10 numeros inteiros: "); //Pede para o usuario digitar 10 numeros inteiros

        for(int i=0; i < vetor.length; i++) { //Loop para ler os 10 numeros inteiros e armazenar no vetor
            vetor[i] = Integer.parseInt(scan.nextLine()); //Lê a entrada do usuario, converte para inteiro e armazena no vetor
        }

        //Imprime o vetor original em linha, abaixo imprime o vetor invertido usando o metodo inverter
        System.out.print("Vetor original: ");
        for(int i=0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Pula uma linha

        // Chama o método recursivo para inverter o vetor
        inverter(vetor, 0, vetor.length - 1);

        // Imprime o vetor invertido
        System.out.print("Vetor invertido: ");
        for(int i=0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Pula uma linha

        scan.close(); //Fecha o Scanner
    }

    //Metodo para inverter a ordem dos elementos do vetor usando recursividade
    public static void inverter(int[] vet, int inicio, int fim) {
        // Caso base: Se o índice inicial cruzar ou igualar o final, a inversão termina
        if (inicio >= fim) {
            return;
        }
        
        // Troca os elementos (swap)
        int temp = vet[inicio];
        vet[inicio] = vet[fim];
        vet[fim] = temp;
        
        // Chamada recursiva com os próximos índices (proximo início, proximo fim)
        inverter(vet, inicio + 1, fim - 1);
    }
    
}
```

## Exercício 4

```java
import java.util.Scanner;

public class atividade4 {
    
    public static void main(String[] args) {

        
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");

        num = Integer.parseInt(scan.nextLine());

        //Imprime o numero convertido para binario usando o metodo converterParaBinario

        System.out.printf("O numero %d em binario é: %s", num, converterParaBinario(num)); //Chama o metodo converterParaBinario utilizando num como parametro, dentro do print para já mostrar o resultado para o usuario.

        scan.close();
        
    }

    //Metodo para converter para numero binario usando recursividade
    public static String converterParaBinario(int numero) {
        if (numero == 0) { //Caso o numero seja 0
            return "0"; // O número 0 em binário é representado como "0"
        } else if (numero == 1) { //Caso o numero seja 1
            return "1"; // O número 1 em binário é representado como "1"
        } else { //Qualquer outro caso
            return converterParaBinario(numero / 2) + (numero % 2); // Chama recursivamente a função com o número dividido por 2 e concatena o resultado com o resto da divisão por 2 (que representa o bit atual)
        }

    }

    /*
    converterParaBinario(10)
        └─ converterParaBinario(5)
            └─ converterParaBinario(2)
                └─ converterParaBinario(1)
                return "1"
            return "10"
         return "101"
     return "1010"
     */

}
```

## Exercício 5

```java
/* Atividade 5 */

/*Uma palavra de Fibonacci e definida por:
f(n) = b se n = 0

f(n) = a se n = 1

f(n) = f(n-1)+f(n-2) se n > 1

Aqui o símbolo “+” denota a concatenação de duas strings. Esta sequência inicia com as seguintes palavras:

b, a, ab, aba, abaab, abaababa, abaababaabaab, ...

Faça um método recursivo que receba um número N e retorne a N- ésima palavra de Fibonacci. */


import java.util.Scanner;
public class atividade5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = Integer.parseInt(scan.nextLine());

        //Imprime a palavra de Fibonacci usando o metodo palavraFibonacci

        System.out.printf("A %d-ésima palavra de Fibonacci é: %s", n, palavraFibonacci(n)); //Chama o metodo palavraFibonacci utilizando n como parametro, dentro do print para já mostrar o resultado para o usuario.

        scan.close();
        
    }

    //metodo para calcular a palavra de Fibonacci usando recursividade

    public static String palavraFibonacci(int n) {
        if (n == 0) { //Caso n seja 0
            return "b"; // A palavra de Fibonacci para n=0 é "b"
        } else if (n == 1) { //Caso n seja 1
            return "a"; // A palavra de Fibonacci para n=1 é "a"
        } else { //Qualquer outro caso
            return palavraFibonacci(n - 1) + palavraFibonacci(n - 2); // Chama recursivamente a função para n-1 e n-2 e concatena os resultados para formar a palavra de Fibonacci atual
        }
    }
}
```

## Exercício 6

```java
//Tribonacci

public class atividade6
{

    public static void main(String[] args){
        

    System.out.println(calcTribonacci(7));
    }


    public static int calcTribonacci(int n){
        if (n ==0){
            return 0;
        } else if( n==1) {
            return 0;
        } else if (n==2){
            return 1;
        } else {
            return calcTribonacci(n-1)+calcTribonacci(n-2)+calcTribonacci(n-3);
        }
    }
}
```

## Exercício 7

```java
//Pell  

public class atividade7
{
    public static void main(String[] args) {
        System.out.println(calcPell(9));
    }
    
    public static int calcPell (int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return 2*calcPell(n-1)+calcPell(n-2);
        }
    }
}
```

## Exercício 8

```java
//Padovan

public class atividade8
{
    public static void main(String[] args) {
        System.out.println(calcPadovan(13));
    }
    
    public static int calcPadovan (int n){
        if (n==0 || n==1 || n==2){
            return 1;
        } else {
            return calcPadovan(n -2)+calcPadovan(n-3);
        }
    }
}
```










