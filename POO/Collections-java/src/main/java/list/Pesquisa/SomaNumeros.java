package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros
{
    private List<Integer> listInteiros;

    public SomaNumeros()
    {
        listInteiros = new ArrayList<>();
    }

    @Override
    public String toString()
    {
        return "SomaNumeros{" +
                "listInteiros=" + listInteiros +
                '}';
    }

    public void adicionarNumero(int numero)
    {
        listInteiros.add(numero);
    }

    public int calcularSoma()
    {
        int total = 0;
        for (Integer numero : listInteiros)
        {
            total += numero;
        }
        return total;
    }

    public int encontrarMaiorNumero()
    {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listInteiros.isEmpty())
        {
            for (Integer numero : listInteiros)
            {
                if (numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero()
    {
        int menorNumero = Integer.MAX_VALUE;
        if (!listInteiros.isEmpty())
        {
            for (Integer numero : listInteiros)
            {
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros()
    {
        if (!listInteiros.isEmpty())
        {
            System.out.println(listInteiros);
        }
        else
        {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args)
    {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(- 2);
        somaNumeros.adicionarNumero(10);

        //System.out.println("Números adicionados:");
        //somaNumeros.exibirNumeros();

        //System.out.println("Soma dos números = " + somaNumeros.calcularSoma
        // ());

        //System.out.println("Maior número = " + somaNumeros
         //.encontrarMaiorNumero());

        //System.out.println("Menor número = " + somaNumeros
        // .encontrarMenorNumero());
    }
}
