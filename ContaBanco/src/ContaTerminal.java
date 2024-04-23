import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o nome do cliente !:\n");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor, digite o número da Agência !:\n");
        agencia = ler.nextLine();

        System.out.println("Por favor, digite o número da Conta !:\n");
        numero = ler.nextInt();        

        System.out.println("Por favor, digite o saldo !:\n");
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+", conta " + numero+" e seu saldo "+ saldo+" já está disponível para saque.");
