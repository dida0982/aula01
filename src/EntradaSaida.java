import java.util.Scanner;

public class EntradaSaida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Olá, %s! Voce tem %d anos. %n", nome, idade);
        scanner.close();
    }
}
// Scanner é usado para ler entrada do usuário
// System.out.print e System.out.printf são usados para exibir saída formatada no console
// %s é um placeholder para strings, %d para inteiros, %n para nova linha
// scanner.nextLine() lê uma linha inteira de texto
// scanner.nextInt() lê um número inteiro da entrada do usuário
