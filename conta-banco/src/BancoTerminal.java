import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:
        // Conhecer e importar a classe Scanner
        // Exibir mensagens para o usuário
        // Obter pela Scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada

        String nomeCliente = new String("");
        String agencia = new String("");
        int numeroConta = 0;
        double saldo = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPor favor, informe seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("\nInforme o número da sua Agência: ");
        agencia = scan.nextLine();

        System.out.println("\nInforme o número da sua conta: ");
        numeroConta = scan.nextInt();

        System.out.println("\nInforme seu saldo bancário: ");
        saldo = scan.nextDouble();

        System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo
                + " já está disponível para saque.\n");

    }
}
