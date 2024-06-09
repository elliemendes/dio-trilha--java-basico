import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicite e receba a agência
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            // Solicite e receba a conta
            System.out.println("Digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do teclado

            // Solicite e receba o nome do cliente
            System.out.println("Digite o Nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            // Solicite e receba o saldo
            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();
            scanner.nextLine();  // Limpa o buffer do teclado

            // Crie a mensagem final e exibe
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                    + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, certifique-se de digitar os valores corretamente.");
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}