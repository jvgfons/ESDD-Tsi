/* Atividade 4 */

/*Uma palavra de Fibonacci e definida por:
f(n) = b se n = 0

f(n) = a se n = 1

f(n) = f(n-1)+f(n-2) se n > 1

Aqui o símbolo “+” denota a concatenação de duas strings. Esta sequência inicia com as seguintes palavras:

b, a, ab, aba, abaab, abaababa, abaababaabaab, ...

Faça um método recursivo que receba um número N e retorne a N- ésima palavra de Fibonacci. */
import java.util.Scanner;
public class atividade4 {
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
