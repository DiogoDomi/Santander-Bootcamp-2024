import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scan.nextInt();
       
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scan.next();
        
        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scan.next();
         
        System.out.print("Por favor, digite o seu Saldo: ");
        double saldo = scan.nextDouble();        
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
