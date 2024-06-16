package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo
{
    public static void main(String[] args)
    {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos)
        {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato)
    {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do
        {

            atendeu = atender();
            continuarTentando = ! atendeu;
            if (continuarTentando)
            {
                tentativasRealizadas++;
            } else
            {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
        {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else
        {
            System.out.println("Não conseguimos contato com " + candidato +
                    ", número máximo de tentativas: " + tentativasRealizadas);
        }
    }

    static boolean atender()
    {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados()
    {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o " +
                "índice do elemento");
        for (int i = 0; i < candidatos.length; i++)
        {
            System.out.println("[" + (i + 1) + "] Candidato: " + candidatos[i]);
        }
    }

    static void selecaoCandidatos()
    {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO",
                "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido)
            {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(2000);
    }

    static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
        {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido)
        {
            System.out.println("Ligar para o candidato, com contra proposta");
        } else
        {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}