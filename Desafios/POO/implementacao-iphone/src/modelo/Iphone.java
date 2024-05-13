package modelo;

import servicos.AparelhoTelefonico;
import servicos.NavegadorDaInternet;
import servicos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDaInternet, ReprodutorMusical
{
    public void ligar()
    {
        System.out.println("Iniciando ligação");
    }
    public void atender()
    {
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz()
    {
        System.out.println("Ligação não atendida. Iniciando correio de voz.");
    }
    public void exibirPagina()
    {
        System.out.println("Exibindo a pagina");
    }
    public void adicionarNovaAba()
    {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina()
    {
        System.out.println("Atualizando a pagina");
    }
    public void tocar()
    {
        System.out.println("Musica iniciada.");
    }
    public void pausar()
    {
        System.out.println("Musica pausada.");
    }
    public void selecionarMusica()
    {
        System.out.println("Selecionando musica.");
    }
}