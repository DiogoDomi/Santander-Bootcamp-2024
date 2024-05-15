package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa
{
    private List<Tarefa> listaDeTarefas;

    public ListaTarefa()
    {
        listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao)
    {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listaDeTarefas)
        {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao))
            {
                tarefasParaRemover.add(tarefa);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas()
    {
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas()
    {
        System.out.println(listaDeTarefas);
    }

    public static void main(String[] args)
    {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
