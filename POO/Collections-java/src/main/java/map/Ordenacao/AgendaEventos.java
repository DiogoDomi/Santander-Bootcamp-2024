package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos
{
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos()
    {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao)
    {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgendas()
    {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento()
    {
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        //eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet())
        {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
            {
                System.out.println("O proximo evento: " + entry.getValue() +
                        " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 10),"Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 22),
                "Evento 4", "Atração 4");

        agendaEventos.exibirAgendas();
        agendaEventos.obterProximoEvento();
    }
}
