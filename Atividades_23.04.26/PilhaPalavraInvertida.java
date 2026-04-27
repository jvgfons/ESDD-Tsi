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
