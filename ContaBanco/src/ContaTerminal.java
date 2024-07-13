import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner terminal = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        System.out.println("Por favor,digite o número da conta:");
        int numero_conta = terminal.nextInt();

        System.out.println("Por favor,digite o número da agência:");
        String numero_agencia = terminal.next();

        System.out.println("Por favor,digite o nome do Cliente:");
        String nome_Cliente = terminal.next();

        System.out.println("Por favor,digite o valor do Saldo da conta");
        double saldo_conta = terminal.nextDouble();


        System.out.println("Olá "  +nome_Cliente+ 
        ", obrigado por criar uma conta em nosso banco,sua agência é " + numero_agencia+ ", conta " +numero_conta + " e seu saldo é R$ "+saldo_conta+ 
         " já está disponível para saque");
    }
}
