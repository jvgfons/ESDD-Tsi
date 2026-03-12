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
