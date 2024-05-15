package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras
{
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras()
    {
        carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade)
    {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome)
    {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()){
            for (Item item : carrinhoDeCompras)
            {
                if (item.getNome().equalsIgnoreCase(nome))
                {
                    itemParaRemover.add(item);
                }
            }
            carrinhoDeCompras.removeAll(itemParaRemover);
        }
        else
        {
            System.out.println("Lista vazia.");
        }
    }

    public double calcularValorTotal()
    {
        double valorTotal = 0d;
        if (!carrinhoDeCompras.isEmpty())
        {
            for (Item item : carrinhoDeCompras)
            {
                valorTotal += item.getQuantidade() * item.getPreco();
            }
            return valorTotal;
        }
        throw new RuntimeException("Lista vazia.");
    }

    public void exibirItens()
    {
        if (!carrinhoDeCompras.isEmpty())
        {
            System.out.println(carrinhoDeCompras);
        }
        else
        {
            System.out.println("Lista vazia.");
        }
    }

    @Override
    public String toString()
    {
        return "Carrinho de compras: " + carrinhoDeCompras + "\n";
    }

    public static void main(String[] args)
    {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
