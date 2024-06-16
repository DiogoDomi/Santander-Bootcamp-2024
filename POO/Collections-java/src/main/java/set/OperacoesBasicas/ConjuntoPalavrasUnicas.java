package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas
{
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas()
    {
        palavrasSet = new HashSet<>();
    }

    @Override
    public String toString()
    {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasSet=" + palavrasSet +
                '}';
    }

    public void adicionarPalavra(String palavra)
    {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra)
    {
        if (!palavrasSet.isEmpty())
        {
            if (palavrasSet.contains(palavra))
            {
                palavrasSet.remove(palavra);
            }
        }
    }

    public boolean verificarPalavra(String palavra)
    {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas()
    {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args)
    {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " +
        conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " +
        conjuntoLinguagens.verificarPalavra("Python"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
