package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos
{
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos()
    {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade,
                                 double preco)
    {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos()
    {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque()
    {
        double valorTotal = 0.0;
        if (!estoqueProdutosMap.isEmpty())
        {
            for (Produto produto : estoqueProdutosMap.values())
            {
                valorTotal+= produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty())
        {
            for (Produto produto : estoqueProdutosMap.values())
            {
                if (produto.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args)
    {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(8L, "Produto D", 2, 20.0);
        estoqueProdutos.adicionarProduto(9L, "Produto E", 1, 2.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
