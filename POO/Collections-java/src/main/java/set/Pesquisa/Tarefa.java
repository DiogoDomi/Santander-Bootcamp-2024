package main.java.set.Pesquisa;

public class Tarefa
{
    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao)
    {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public Boolean getConcluida()
    {
        return concluida;
    }

    public void setConcluida(Boolean concluida)
    {
        this.concluida = concluida;
    }

    @Override
    public String toString()
    {
        return "{" + descricao + " -> " + concluida + "}";
    }
}
