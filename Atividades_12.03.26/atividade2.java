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