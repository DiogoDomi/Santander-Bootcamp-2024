import java.util.Scanner;
public class VerificacaoChequeEspecial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final double limiteChequeEspecial = 500.0;

        System.out.print("Digite o valor do seu saldo: R$ ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o valor de saque: R$ ");
        double saque = scanner.nextDouble();

        if (saque < saldo)
        {
            System.out.println("Transacao realizada com sucesso.");
        }
        else
        {
            if (saque > (limiteChequeEspecial + saldo))
            {
                System.out.println("Transacao nao realizada. Limite do cheque" +
                        " especial excedido.");

            }
            else
            {
                System.out.println("Transacao realizada com sucesso " +
                        "utilizando o cheque especial.");
            }
        }
        scanner.close();
    }
}
