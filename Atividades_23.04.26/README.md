## Exercicio 1

1. Considere uma pilha inicialmente vazia. Desenhe o estado da pilha após cada operação e indique 
o que será retornado/impresso pelos comandos pop().

# A tabela com cada etapa da pilha descrita no exercício fica da seguinte forma:

                    |  Entrada | push | pop | pilha |
                    |:--------:|:----:|:---:|:-----:|
                    | push(10) |  10  |     |   10  |
                    | push(20) |  20  |     | 10 20 |
                    |   pop()  |      |  20 |   10  |
                    | push(30) |  30  |     | 10 30 |
                    |   pop()  |      |  30 |   10  |
                    |   pop()  |      |  10 |       |

## Exercicio 2
2. Dada a sequência de operações: 
push(A), 
push(B), 
pop(), 
push(C), 
pop(), 
pop(), 
push(D).
• A ordem de remoção (saída) dos elementos foi: [___, ___, ___]

A ordem de remoção dos elementos nesse caso foi B,C,A.

## Exercício 3

3. Descreva o estado da pilha (inicialmente vazia) após cada uma das operações a seguir. push(5), 
push(3), pop(), push(2), push(8), pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), 
pop(), push(4), pop(), pop(). 

Fiz uma tabela que representa o estado da pilha em cada etapa:

                    | Entrada | push | pop |  pilha  |
                    |:-------:|:----:|:---:|:-------:|
                    | push(5) |   5  |     |    5    |
                    | push(3) |   3  |     |   5 3   |
                    |  pop()  |      |  3  |    5    |
                    | push(2) |   2  |     |   5 2   |
                    | push(8) |   8  |     |  5 2 8  |
                    |  pop()  |      |  8  |   5 2   |
                    |  pop()  |      |  2  |    5    |
                    | push(9) |   9  |     |   5 9   |
                    | push(1) |   1  |     |  5 9 1  |
                    |  pop()  |      |  1  |   5 9   |
                    | push(7) |   7  |     |  5 9 7  |
                    | push(6) |   6  |     | 5 9 7 6 |
                    |  pop()  |      |  6  |  5 9 7  |
                    |  pop()  |      |  7  |   5 9   |
                    | push(4) |   4  |     |  5 9 4  |
                    |  pop()  |      |  4  |   5 9   |
                    |  pop()  |      |  9  |    5    |

## Exercício 4

4. Crie um programa em Java que utilize pilha para inverter uma palavra digitada pelo usuário.

```java
import java.util.Scanner;
import java.util.Stack;

public class PilhaPalavraInvertida {

    public static void main(String[] args) {

        String palavra;

        System.out.print("Digite uma palavra:");
        Scanner scan = new Scanner(System.in);
        palavra = scan.nextLine();

        scan.close();

        String palavraInvertida = inverterPalavra(palavra);

        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    //Metodo para inverter a palavra usando pilha
    public static String inverterPalavra(String palavra) {
        // Cria uma pilha para armazenar os caracteres da palavra.
        Stack<Character> pilha = new Stack<>();

        // Percorre cada posição da palavra original.
        for (int i = 0; i < palavra.length(); i++) {
            // Empilha o caractere que está na posição atual.
            pilha.push(palavra.charAt(i));
        }

        // Cria uma variável para montar a palavra invertida.
        String palavraInvertida = "";

        // Repete enquanto ainda houver caracteres dentro da pilha.
        while (!pilha.empty()) {
            // Remove o caractere do topo da pilha e adiciona na palavra invertida.
            palavraInvertida = palavraInvertida + pilha.pop();
        }

        // Retorna a palavra já invertida.
        return palavraInvertida;
    }

}
```

### Exemplo 1

```text
Entrada do usuário:
banana

Saída do programa:
Digite uma palavra:banana
Palavra invertida: ananab
```

### Exemplo 2

```text
Entrada do usuário:
computador

Saída do programa:
Digite uma palavra:computador
Palavra invertida: rodatupmoc
```

