import java.util.Locale;
import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class Desafio
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String tipoCofre = scanner.nextLine().toLowerCase();

        if (tipoCofre.equalsIgnoreCase("digital"))
        {
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();


            if (cofre.validarSenha(confirmacaoSenha))
            {
                System.out.println("Cofre aberto!");
            }
            else
            {
                System.out.println("Senha incorreta!");
            }
        }
        else
        {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }

        scanner.close();
    }
}