import java.util.Scanner;
public class Contador
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try
        {
            contar(parametroUm, parametroDois);

        }
        catch (ParametrosInvalidosException exception)
        {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        if (parametroUm > parametroDois)
        {
            throw new ParametrosInvalidosException("O segundo parâmetro deve " +
                    "ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i=1; i<=contagem; i++)
        {
            System.out.println("Imprimindo número " + i);
        }
    }
}