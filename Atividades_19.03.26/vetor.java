import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {

        boolean crescente;        
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextInt();
        }

        crescente = crescente(vetor);

        if (crescente) {
            System.out.println("O vetor esta em ordem crescente.");
        } else {
            System.out.println("O vetor nao esta em ordem crescente.");
        }

        scan.close();

    }

    //Metodo para verificar se o vetor esta em ordem crescente

    public static boolean crescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }
}