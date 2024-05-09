import java.util.Scanner;

public class SimulacaoBancaria
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;
        do
        {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma das opções acima: ");

            opcao = scanner.nextInt();
            switch (opcao)
            {
                case 1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + String.format(
                            "%.1f",
                            saldo));
                    break;

                case 2:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double saque = scanner.nextDouble();
                    if (saldo < saque)
                    {
                        System.out.println("Saldo insuficiente.");
                    }
                    else
                    {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + String.format("%" +
                                        ".1f",
                                saldo));
                    }
                    break;

                case 3:
                    System.out.println(("Saldo atual: " + String.format("%.1f"
                            , saldo) ));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while (opcao != 0);
	scanner.close();

    }
}