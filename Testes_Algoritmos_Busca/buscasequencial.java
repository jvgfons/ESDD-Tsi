package Testes_Algoritmos_Busca;

import java.util.Scanner;

public class buscasequencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n[]  = new int[10];
        int x;
        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %d valor do vetor: ",i+1);
            n[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.print("Digite o numero a ser encontrado: ");
        x = Integer.parseInt(scan.nextLine());

        int resultado = search(n, x);

        System.out.printf("O numero %d foi encontrado na posicao: %d", x, resultado);

        scan.close();

    }

    public static int search( int[] array, int key ) {
        int n = array.length;
        for ( int i = 0; i < n; i++ ) {
            if ( array[i] == key ) {
            return i;
            }
        }
    return -1;
    }
    
}
