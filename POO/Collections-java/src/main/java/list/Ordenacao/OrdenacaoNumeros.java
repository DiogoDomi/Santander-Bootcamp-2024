package main.java.list.Ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros
{
    private List<Integer> numeros;

    public OrdenacaoNumeros()
    {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente()
    {
        List<Integer> ordenadaAscendente = new ArrayList<>(numeros);
        if(!numeros.isEmpty())
        {
            Collections.sort(ordenadaAscendente);
        }
        return ordenadaAscendente;
    }

    public List<Integer> ordenarDescendente()
    {
        List<Integer> ordenadaDescendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty())
        {
            ordenadaDescendente.sort(Collections.reverseOrder());
        }
        return ordenadaDescendente;
    }

    public void exibirNumeros()
    {
        if (!numeros.isEmpty())
        {
            System.out.println(numeros);
        }
        else
        {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        //numeros.exibirNumeros();

        //System.out.println(numeros.ordenarAscendente());

        //numeros.exibirNumeros();

        //System.out.println(numeros.ordenarDescendente());

        //numeros.exibirNumeros();
    }
}
