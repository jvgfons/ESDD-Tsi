import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

            //Inicializacao das variaveis

        int num1;
        int num2;

            //Inicializacao do Scanner para ler a entrada do usuario

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");

        //Pede o numero usando parseInt para converter a string em inteiro
        num1 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite a potencia para o primeiro numero: ");
        num2 = Integer.parseInt(scan.nextLine());

        System.out.printf("O resultado de %d elevado a %d é: %d", num1, num2, potencia(num1, num2)); //Chama o metodo potencia utilizando num1 e num2 como parametros, dentro do print para já mostrar o resultado para o usuario.

        

        scan.close();
        
        
    }

    //Metodo para calcular a potencia usando recursividade
    public static int potencia(int base, int expoente) {
    if (expoente == 0) {
        return 1;
    } else {
        int resultadoParcial = potencia(base, expoente - 1); // chamada recursiva
        int resultado = base * resultadoParcial; // variável para acompanhar no debug
        return resultado;
    }
}
}