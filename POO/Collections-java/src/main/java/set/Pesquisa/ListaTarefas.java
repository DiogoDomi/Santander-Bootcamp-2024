package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas
{
    private Set<Tarefa> listaDeTarefas;

    public ListaTarefas()
    {
        listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao)
    {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao)
    {
        if (!listaDeTarefas.isEmpty())
        {
            for (Tarefa tarefa : listaDeTarefas)
            {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                {
                    listaDeTarefas.remove(tarefa);
                    break;
                }
            }
        }
    }

    public void exibirTarefas()
    {
        System.out.println(listaDeTarefas);
    }

    public int contarTarefas()
    {
        return listaDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas()
    {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!listaDeTarefas.isEmpty())
        {
            for (Tarefa tarefa : listaDeTarefas)
                if (tarefa.getConcluida().equals(true))
                {
                    tarefasConcluidas.add(tarefa);
                }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes()
    {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!listaDeTarefas.isEmpty())
        {
            for (Tarefa tarefa : listaDeTarefas)
            {
                if (tarefa.getConcluida().equals(false))
                {
                    tarefasPendentes.add(tarefa);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao)
    {
        if (!listaDeTarefas.isEmpty())
        {
            for (Tarefa tarefa : listaDeTarefas)
            {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefa.setConcluida(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao)
    {
        if (!listaDeTarefas.isEmpty())
        {
            for (Tarefa tarefa : listaDeTarefas)
            {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefa.setConcluida(null);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas()
    {
        listaDeTarefas.clear();
    }

    public static void main(String[] args)
    {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas
         .contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
