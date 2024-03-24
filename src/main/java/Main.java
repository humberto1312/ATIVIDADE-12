import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número para o qual deseja ver a tabuada
        System.out.println("Digite um número inteiro de 1 a 10 para gerar a tabuada:");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo válido
        if (numero >= 1 && numero <= 10) {
            // Imprime a tabuada do número informado pelo usuário
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 10.");
        }

        scanner.close();
    }
}
