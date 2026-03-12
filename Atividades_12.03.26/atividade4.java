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
