package main.java.list.OperacoesBasicas;

public class Tarefa
{
    private String descricao;

    public Tarefa(String desc)
    {
        descricao = desc;
    }

    public String getDescricao()
    {
        return descricao;
    }

    @Override
    public String toString()
    {
        return descricao;
    }
}
