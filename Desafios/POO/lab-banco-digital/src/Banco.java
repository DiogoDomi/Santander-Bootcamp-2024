import java.util.ArrayList;
import java.util.List;

public class Banco
{
    private String nome;
    private List<Conta> contasBancarias;

    public Banco(String nome)
    {
        this.nome = nome;
        this.contasBancarias = new ArrayList<>();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta)
    {
        contasBancarias.add(conta);
    }

    public void removerConta(Conta conta)
    {
        contasBancarias.remove(conta);
    }

    public void exibirContas()
    {
        System.out.println(contasBancarias);
    }

}
