import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        

        try
        {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scan.next();
    
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scan.next();
    
            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();
    
            System.out.print("Digite seu nome: ");
            double altura = scan.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scan.close();
        }
        catch (InputMismatchException e) 
        {
            System.out.println("Error: " + e);
        }      
        
    }
}
