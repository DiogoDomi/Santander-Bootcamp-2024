import java.util.Scanner;

public class ControleSimplesDeSaques
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do limite diario de saque: R$ ");
        double limiteDiarioSaque = scanner.nextDouble();

	    for (int i=1; ; i++)
        {
            System.out.print("Digite o valor do saque: R$ ");
            double saque = scanner.nextDouble();

            if (saque == 0.0)
            {
                System.out.println("Transacoes encerradas.");
                break;
            }
	        else if (saque > 0.0 && saque <= limiteDiarioSaque)
            {
                limiteDiarioSaque -= saque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiarioSaque));
            }
            else
            {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}
