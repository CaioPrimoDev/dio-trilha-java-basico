import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Nome do cliente(String) + agência(String) + número da conta(int) + saldo(double);
        System.out.println("\nBem Vindo ao Banco Santander!\n\nGostario de proseguir com a criação da sua conta?\nPresione ENTER para continuar...");
           scanner.nextLine();

        System.out.println("\nInforme seu nome: ");
           String nome = scanner.next();

        System.out.println("\nInforme seu sobrenome: ");
           String sobrenome = scanner.next();
           String nomeCliente = nome + " " + sobrenome;
       
        System.out.println("\nInforme sua Agência: ");
           String agencia = scanner.next();
           
        System.out.println("\nInforme o número da sua conta: ");
           int numeroConta = scanner.nextInt();

           scanner.nextLine();

        System.out.println("\nParabens!\nSua conta foi criada com sucesso\n\nDigite ENTER para fazer seu primeiro deposito...");
           scanner.nextLine();

        System.out.println("\nInforme o valor que deseja depositar: ");
           double deposito = scanner.nextDouble();
           double saldo = 0;
           saldo = saldo + deposito;    
        
           System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+  numeroConta + " e o seu saldo de " + saldo + " já está disponível para saque!\n\n");
    }
    
}
